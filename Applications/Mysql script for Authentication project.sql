create database authentication;
use authentication;

create table users(
id int primary key auto_increment,
username varchar(50) not null,
uemail varchar(50) not null unique,
upassword varchar(50) not null,
umobile bigint(10) not null unique
);

desc users;