use studentdetails;

select * from student;

update student set marks = 98 where rollNo = 1;

update student set name = 'Raj', marks = 78 where rollNo = 3;

select * from student;

-- delete
delete from student where rollNo = 3;
select * from student;

-- delete all records
delete from student;

select * from student;