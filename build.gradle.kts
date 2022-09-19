val koinVersion: String by project
val komapperVersion: String by project
val kotlinLoggingVersion: String by project
val kotlinWrappersVersion: String by project
val ktorVersion: String by project
val logbackVersion: String by project
val mockkVersion: String by project
val r2dbcVersion: String by project
val serializationVersion: String by project
val striktVersion: String by project

plugins {
    application
    id("com.google.devtools.ksp") version "1.7.10-1.0.6"
    kotlin("multiplatform") version "1.7.10"
    kotlin("plugin.serialization") version "1.7.10"
    id("io.ktor.plugin") version "2.1.1"
}

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js {
        binaries.executable()
        browser {
            testTask {
                useKarma {
                    useChromeHeadless()
                }
            }
            commonWebpackConfig {
                cssSupport.enabled = true
                devtool = org.jetbrains.kotlin.gradle.targets.js.webpack.WebpackDevtool.EVAL_CHEAP_SOURCE_MAP
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-core:$ktorVersion")
                implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            kotlin.srcDir("build/generated/ksp/jvm/jvmMain/kotlin")

            dependencies {
                implementation(project.dependencies.enforcedPlatform("org.komapper:komapper-platform:$komapperVersion"))
                implementation("org.komapper:komapper-starter-r2dbc")
                implementation("org.komapper:komapper-dialect-postgresql-r2dbc")
                implementation("org.postgresql:r2dbc-postgresql:$r2dbcVersion")

                implementation("ch.qos.logback:logback-classic:$logbackVersion")
                implementation("io.github.microutils:kotlin-logging:$kotlinLoggingVersion")

                implementation("io.insert-koin:koin-core-jvm:$koinVersion")
                implementation("io.insert-koin:koin-ktor:$koinVersion")
                implementation("io.insert-koin:koin-logger-slf4j:$koinVersion")

                implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktorVersion")
                implementation("io.ktor:ktor-serialization-jvm:$ktorVersion")
                implementation("io.ktor:ktor-server-auth-jwt-jvm:$ktorVersion")
                implementation("io.ktor:ktor-server-auth-jvm:$ktorVersion")
                implementation("io.ktor:ktor-server-call-logging-jvm:$ktorVersion")
                implementation("io.ktor:ktor-server-compression-jvm:$ktorVersion")
                implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktorVersion")
                implementation("io.ktor:ktor-server-core-jvm:$ktorVersion")
                implementation("io.ktor:ktor-server-cors-jvm:$ktorVersion")
                implementation("io.ktor:ktor-server-netty-jvm:$ktorVersion")
                implementation("io.ktor:ktor-server-resources-jvm:$ktorVersion")
            }
        }
        val jvmTest by getting {
            kotlin.srcDir("build/generated/ksp/jvm/jvmTest/kotlin")

            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-annotations-common"))

                implementation("io.ktor:ktor-server-tests-jvm:$ktorVersion")
                implementation("io.ktor:ktor-server-test-host-jvm:$ktorVersion")

                implementation("io.ktor:ktor-client-core-jvm:$ktorVersion")
                implementation("io.ktor:ktor-client-content-negotiation-jvm:$ktorVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json-jvm:$serializationVersion")

                implementation("io.mockk:mockk:$mockkVersion")
                implementation("io.strikt:strikt-core:$striktVersion")
                implementation("io.strikt:strikt-mockk:$striktVersion")
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(project.dependencies.enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:$kotlinWrappersVersion"))

                implementation("org.jetbrains.kotlin-wrappers:kotlin-css")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-mui")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom")

                implementation("io.ktor:ktor-client-js:$ktorVersion")

                implementation(npm("phaser", "beta"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

ksp {
    arg("komapper.namingStrategy", "lower_snake_case")
}

dependencies {
    add("kspJvm", "org.komapper:komapper-processor:$komapperVersion")
    add("kspJvmTest", "org.komapper:komapper-processor:$komapperVersion")
}

application {
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=true")
    mainClass.set("dev.thebeyond.application.ServerKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = freeCompilerArgs + "-opt-in=kotlin.RequiresOptIn"
    }
}

// include JS artifacts in any JAR we generate
tasks.getByName<Jar>("jvmJar") {
    val taskName =
        if (project.hasProperty("isProduction") || project.gradle.startParameter.taskNames.contains("installDist")) {
            "jsBrowserProductionWebpack"
        } else {
            "jsBrowserDevelopmentWebpack"
        }
    val webpackTask = tasks.getByName<org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack>(taskName)
    dependsOn(webpackTask) // make sure JS gets compiled first
    from(File(webpackTask.destinationDirectory, webpackTask.outputFileName)) // bring output file along into the JAR
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}

distributions {
    main {
        contents {
            from("$buildDir/libs") {
                rename("${rootProject.name}-jvm", rootProject.name)
                into("lib")
            }
        }
    }
}

// Alias "installDist" as "stage" (for cloud providers)
tasks.create("stage") {
    dependsOn(tasks.getByName("installDist"))
}

tasks.getByName<JavaExec>("run") {
    classpath(tasks.getByName<Jar>("jvmJar")) // so that the JS artifacts generated by `jvmJar` can be found and served
}
