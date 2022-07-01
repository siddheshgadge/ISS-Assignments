-- accept as input rno and return name and address of that student

delimiter $$
drop function if exists function1 $$
create function function1(rn int) returns varchar(50) deterministic
begin
declare na varchar(20) default '';
declare lo varchar(20) default '';
declare msg varchar(40) default '';
declare co int default 0;

select count(*) into co from student where rollNo = rn;
if co = 0 then
	set msg = 'no records found';
else
	select studentName,address into na,lo from student where rollNo = rn;
	set msg = concat('name = ', na,' location = ',lo);
end if;
return msg; 
end $$
delimiter ;

select function1(2);
select function1(8);