use studentdetails;

-- count number of students
select count(*) from student;

-- max min marks 
select studentName, prevEduMarks as Highest_Marks from student where prevEduMarks = (select max(prevEduMarks) from student);
select studentName, prevEduMarks as Lowest_Marks from student where prevEduMarks = (select min(prevEduMarks) from student);

-- group by
-- sum and avg marks from each addressLocation 
select address, sum(prevEduMarks) as TotalMarks from student group by address;
select address, avg(prevEduMarks) as AverageMarks from student group by address;
-- max marks from each location
select address, max(prevEduMarks) as HighestMarks from student group by address;
select * from student;

-- having
-- locations where average age is greater than 20
select address, avg(age) as AverageAge from student group by address having avg(age) > 20;

-- locations where average marks are greater than 80
select address, avg(prevEduMarks) as AverageMarks from student group by address having avg(prevEduMarks) > 80;

