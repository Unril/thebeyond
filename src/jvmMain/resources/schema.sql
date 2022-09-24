create table users
(
    id         uuid        not null primary key,
    email      text        not null unique,
    name       text        not null,
    password   text        not null,
    role       text        not null,
    created_at timestamptz not null,
    changed_at timestamptz not null,
    version    bigint      not null,
    constraint check_role
        check (role in ('USER', 'MODERATOR', 'ADMIN'))
);
