use studentdetails;

--  accept departmentId as input and return  list of student names

delimiter $$
drop procedure if exists departmentWiseStudents $$
create procedure departmentWiseStudents(did int,out data varchar(500))
begin
declare na varchar(20) default '';
declare co int default 0;
declare i int default 1;

declare cur cursor for select studentName from student where departmentId = did;

select count(*) into co from student where departmentId = did;
if co = 0 then
	set data = 'no records';
else
	set data = '';
	open cur;
	while i<=co do
		fetch cur into na;
		set data = concat(data,' --> ',na,char(13));
		set i = i+1;
	end while;
	close cur;
end if;
end $$
delimiter ;

call departmentWiseStudents(1, @data);
select @data;