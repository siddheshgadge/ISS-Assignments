-- Table creation and deletion
use studentdetails;

create table student (
rollNo int primary key,
name varchar(50),
marks int
);

desc student;

drop table student;

