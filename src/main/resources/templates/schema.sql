
create table if not exists history (
    id bigint not null primary key unique ,
    codec varchar(50) not null ,
    input varchar(255) not null ,
    translated varchar(255) not null ,
    date date not null
);
create table if not exists input (
    id bigint not null primary key unique ,
    input varchar(255) not null

);

create table if not exists users
(
    id         bigserial    not null,
    email      varchar(255) not null unique,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    role       varchar(20)  not null,
    password   varchar(255) not null,
    status     varchar(20)  not null,
    primary key (id)
);