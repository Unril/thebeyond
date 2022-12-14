#ifdef GL_ES
precision mediump float;
#endif

uniform float time;
uniform vec2 mouse;
uniform vec2 resolution;

// Dave Hoskins hash functions
vec4 hash42(vec2 p)
{
    vec4 p4 = fract(vec4(p.xyxy) * vec4(.1031, .1030, .0973, .1099));
    p4 += dot(p4, p4.wzxy + 19.19);
    return fract((p4.xxyz + p4.yzzw) * p4.zywx) - 0.5;
}

vec2 hash22(vec2 p)
{
    vec3 p3 = fract(vec3(p.xyx) * vec3(443.897, 441.423, 437.195));
    p3 += dot(p3, p3.yzx + 19.19);
    return -1.0 + 2.0 * fract((p3.xx + p3.yz) * p3.zy);
}

// IQ's Gradient Noise
float Gradient2D(in vec2 p)
{
    vec2 i = floor(p);
    vec2 f = fract(p);
    vec2 u = f * f * (3.0 - 2.0 * f);

    return mix(mix(dot(hash22(i + vec2(0.0, 0.0)), f - vec2(0.0, 0.0)),
                   dot(hash22(i + vec2(1.0, 0.0)), f - vec2(1.0, 0.0)), u.x),
               mix(dot(hash22(i + vec2(0.0, 1.0)), f - vec2(0.0, 1.0)),
                   dot(hash22(i + vec2(1.0, 1.0)), f - vec2(1.0, 1.0)), u.x), u.y);
}


const vec3 cold = vec3(255.0, 244.0, 189.0) / 255.0;
const vec3 hot = vec3(181.0, 236.0, 255.0) / 255.0;

vec3 StarFieldLayer(vec2 p, float du, float count, float brightness, float size)
{
    // Tiling:
    du *= count;
    p *= count;
    vec2 pi = floor(p);
    p = fract(p) - 0.5;

    // Randomize position, brightness and spectrum:
    vec4 h = hash42(pi);

    // Resolution independent radius:
    float s = brightness * (0.7 + 0.6 * h.z) * smoothstep(0.8 * du, -0.2 * du, length(p + 0.9 * h.xy) - size * du);

    return s * mix(mix(vec3(1.0), cold, min(1.0, -2.0 * h.w)), hot, max(0.0, 2.0 * h.w));
}

vec3 StarField(vec2 p, float du)
{
    vec3 c = StarFieldLayer(p, du, 25.0, 0.18, 0.5);
    c += StarFieldLayer(p, du, 15.0, 0.25, 0.5);
    c += StarFieldLayer(p, du, 12.0, 0.50, 0.5);
    c += StarFieldLayer(p, du, 5.0, 1.00, 0.75);
    c += StarFieldLayer(p, du, 3.0, 2.00, 1.0);

    // Cluster
    float s = 2.0 * (max(0.2, Gradient2D(4.0 * p * vec2(1.2, 1.9))) - 0.2) / (1.0 - 0.2);
    c += s * StarFieldLayer(p, du, 160.0, 0.10, 0.5);
    c += s * StarFieldLayer(p, du, 80.0, 0.15, 0.5);
    c += s * StarFieldLayer(p, du, 40.0, 0.25, 0.5);
    c += s * StarFieldLayer(p, du, 30.0, 0.50, 0.5);
    c += s * StarFieldLayer(p, du, 20.0, 1.00, 0.75);
    c += s * StarFieldLayer(p, du, 10.0, 2.00, 1.0);

    c *= 1.3;

    // Resolution independent brightness:
    float f = 1.0 / sqrt(200.0 * du);

    return f * min(c, 1.0);
}

void main(void)
{
    float du = 1.0 / resolution.y;
    vec2 mouseCorr = vec2(-mouse.x, mouse.y) * 0.001 / resolution.xy;
    vec2 uv = du * (gl_FragCoord.xy - 0.5 * resolution.xy);
    vec2 uvRes = uv + 1.33 + time * 0.0001 - mouseCorr.xy;
    vec3 field = StarField(uvRes, du);
    gl_FragColor = vec4(field, 0.0);
}
