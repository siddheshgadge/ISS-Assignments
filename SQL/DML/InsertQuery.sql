use studentdetails;

truncate table student;

insert into student values(1,'Ramesh',56);

insert into student values(2, 'Sanket', 98);

insert into student values(3, 'Harshal', 90), (4,'Siddhesh',92);

select * from student;

-- replace -> if record exists delete and then insert 

replace into student values(4, 'Siddhesh', 95);

select * from student;