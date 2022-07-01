-- wamf to find the number of students

use student;
delimiter $$

drop function if exists f1 $$

create function f1() returns int deterministic
begin

declare co int default 0;
select count(*) into co from studentdetails;
return co;

end $$
delimiter ;