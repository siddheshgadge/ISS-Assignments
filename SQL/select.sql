use studentdetails;

-- select 
select * from department;
select studentName, age, address from student;
select distinct address as Unique_address from student;

-- where
select * from student where departmentId = 1;
select * from student where rollNo > 7;

-- And/or
select studentName,address,departmentId from student where address = 'mumbai' and departmentId = 1;
select studentName,address from student where address = 'mumbai' or address = 'pune';

-- order by
select  * from student order by studentName;
select  rollNo, studentName, prevEduMarks from student order by prevEduMarks DESC;
select  rollNo, studentName, prevEduMarks from student order by prevEduMarks DESC, studentName;

-- limit (mysql) (select top in sql developer)
-- find student with highest marks using orderby
select * from student order by prevEduMarks DESC limit 1;
-- Top 3 student with highest marks
select * from student order by prevEduMarks DESC limit 3;
-- student with 2nd highest marks
select * from student order by prevEduMarks DESC limit 1,1;

-- like and wildcards 
-- student starting name with s
select rollNo, studentName from student where studentName like 's%';
-- student ending name with s
select rollNo, studentName from student where studentName like '%a';
-- student has 2nd letter a in name
select rollNo, studentName from student where studentName like '_a%';
-- student has 2nd last letter s in name
select rollNo, studentName from student where studentName like '%s_';

-- between
select  rollNo, studentName, prevEduMarks from student where prevEduMarks between 80 and 100;

-- in
select * from student where address in ('mumbai','pune','nagpur');



