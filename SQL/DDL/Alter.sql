use studentdetails;

create table book(
book_id int unsigned not null,
book_name varchar(10),
author_name varchar(50)
);

desc book;

alter table book add column book_price decimal(10,2) not null;

desc book;

alter table book modify book_name varchar(30);

alter table book add column publisher_name varchar(100) after book_name;

alter table book
modify book_name varchar(30) not null,
modify author_name varchar(50) not null;

alter table book modify book_price decimal(10,2) unsigned not null;

desc book;

alter table book add constraint primaryKey primary key(book_id) ;
desc book;

alter table book drop book_price;
desc book;