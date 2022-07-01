use studentdetails;

drop table if exists student;
drop table if exists department;

create table department(
departmentId int primary key,
departmentName varchar(50) not null
);

create table student(
rollNo int unsigned primary key auto_increment,
studentName varchar(50) not null,
phoneNo bigint unique,
address varchar(20) default 'mumbai',
age int check (age >= 18),
departmentId int,
foreign key(departmentId) references department(departmentId) on delete cascade
);

create index indexPhone on student (phoneNo);

show index from student;

desc department;

desc student;

insert into department values(1,'CMPN'),(2,'EXTC'),(3,'IT');
insert into student (studentName,phoneNo,age,departmentId) values('siddhesh',1235846589,23,1);

select * from department;
select * from student;


