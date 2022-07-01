
delimiter $$

drop procedure if exists p8 $$

create procedure circle(in rad double, out area double, out circumference double)
begin

declare pi double default 3.14159;

set area = pi * rad * rad;
set circumference = 2 * pi * rad;

set area = round (area,2);
set circumference = round(circumference,3);

end $$

delimiter ;

call circle(5, @area, @circumference);
select @area, @circumference;