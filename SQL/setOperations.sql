use studentdetails;
drop table if exists java_students;
drop table if exists python_students;

create table java_students(name varchar(20));
insert into java_students values('amit'), ('raju'), ('vikas');

create table python_students(name varchar(20));
insert into python_students values('sumit'), ('raju'), ('reena'),('tina');

select * from java_students;
select * from python_students;

-- union
select * from java_students
union
select * from python_students;

-- union all
select * from java_students
union all
select * from python_students;

-- intersection		(there is no intersection operator in mysql)
select java_students.name from java_students
inner join python_students on java_students.name = python_students.name;

select java_students.name from java_students
inner join python_students 
using(name);


-- minus		(there is no minus operator in mysql)
select java_students.name from java_students
left outer join python_students 
on java_students.name = python_students.name
where python_students.name is null;