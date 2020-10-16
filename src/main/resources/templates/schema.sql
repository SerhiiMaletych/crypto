create table if not exists app_user (
    id bigint not null primary key unique ,
    name varchar(100) not null unique ,
    password varchar(10) not null
    );
create table if not exists history (
    id bigint not null primary key unique ,
    codec varchar(50) not null ,
    userInput varchar(255) not null ,
    translated varchar(255) not null ,
    date date not null
);
create table if not exists input (
    id bigint not null primary key unique ,
    input varchar(255) not null

);