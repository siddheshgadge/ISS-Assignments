-- return two lists
-- list of student names from mumbai and another from pune

delimiter $$
drop procedure if exists studentsList $$
create procedure studentsList(out d1 varchar(300), out d2 varchar(300))
begin

declare na varchar(20) default '';
declare lo varchar(20) default '';
declare co int default 0;
declare i int default 1;

declare c1 cursor for select studentName, address from student;
select count(*) into co from student;
if co = 0 then
	set d1 = 'no records';
	set d2 = 'no records';
else
	set d1 = '';
	set d2 = '';
	open c1;
		repeat
			fetch c1 into na, lo;
			if lo = 'mumbai' then
				set d1 = concat(d1,na,' ');
			end if;
            if lo = 'pune' then
				set d2 = concat(d2,na,' ');	
			end if;
			set i = i + 1;
		until i > co end repeat;
	close c1;
end if;
end $$
delimiter ;

call studentsList(@mumbai,@pune);
select @mumbai;
select @pune;
