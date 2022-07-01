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
prevEduMarks int not null,
phoneNo bigint unique,
address varchar(20) default 'mumbai',
age int check (age >= 18),
departmentId int,
foreign key(departmentId) references department(departmentId) on delete cascade
);

insert into department values(1,'CMPN'),(2,'EXTC'),(3,'IT');

insert into student (studentName,prevEduMarks,phoneNo,age,departmentId) values('siddhesh',90,1235846589,23,1);

insert into student (studentName,prevEduMarks,phoneNo,address,age,departmentId) values('sanket',92,1236846589,'nagpur',21,1);
insert into student (studentName,prevEduMarks,phoneNo,address,age,departmentId) values('sagar',72,1236842589,'thane',20,1);
insert into student (studentName,prevEduMarks,phoneNo,address,age,departmentId) values('rashmika',80,1232846589,'mumbai',24,2);
insert into student (studentName,prevEduMarks,phoneNo,address,age,departmentId) values('rakesh',65,1236246589,'ghatkopar',19,3);
insert into student (studentName,prevEduMarks,phoneNo,address,age,departmentId) values('sakshi',74,7236846589,'nagpur',22,1);
insert into student (studentName,prevEduMarks,phoneNo,address,age,departmentId) values('jui',79,1436846589,'raigad',21,2);
insert into student (studentName,prevEduMarks,phoneNo,address,age,departmentId) values('robert',82,8236846589,'pune',19,2);
insert into student (studentName,prevEduMarks,phoneNo,address,age,departmentId) values('jayesh',89,7136846589,'pune',22,1);
insert into student (studentName,prevEduMarks,phoneNo,address,age,departmentId) values('sanika',87,2236846589,'mumbai',21,3);
insert into student (studentName,prevEduMarks,phoneNo,address,age,departmentId) values('trisha',86,3236846589,'mumbai',21,2);
