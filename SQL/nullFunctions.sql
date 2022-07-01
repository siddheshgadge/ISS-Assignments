use studentdetails;

insert into student (studentName,prevEduMarks,phoneNo,address,departmentId) values('abhishek',71,1236241589,'ghatkopar',3);

select * from student;

select studentName, ifnull(age,25) from student;
select studentName, coalesce(age,25) from student;

