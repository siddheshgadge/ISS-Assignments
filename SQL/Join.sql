drop database if exists BigCinemas;
create database if not exists BigCinemas;
use BigCinemas;

create table Movies( id int primary key,
title varchar(20), category varchar(30));
desc Movies;

insert into Movies values(1, "soldier", "action");
insert into Movies values(2, "baghban", "family");
insert into Movies values(3, "dabangg", "action");
insert into Movies values(4, "my friend ganesha", "animation");
insert into Movies values(5, "robot", "animation");
insert into Movies values(6, "ra.1", "action");
insert into Movies values(7, "k3g", "family");

create table Members( id int primary key,
fn varchar(20), ln varchar(20),
movie_id int, foreign key(movie_id) references Movies(id));
desc Members;

insert into Members values(1, "amit", "kumar", 1);
insert into Members values(2, "sumit", "khan", 3);
insert into Members values(3, "rumit", "khan", 6);
insert into Members values(4, "namit", "bacchan", 7);
insert into Members values(5, "mit", "khan", 3);
insert into Members values(7, "jeet", "khanna", NULL);
insert into Members values(9, "jeet", "kumar", NULL);

select * from Movies;
select * from Members;

-- cartesian join
select members.id, fn, ln, title, category from movies join members;

-- full join
select * from movies join members where members.movie_id = movies.id;

select * from members natural join movies;

select * from movies inner join members on movies.id = members.movie_id;

select title, fn, ln,category from movies inner join members on movies.id = members.movie_id;

select title, fn, ln, category from movies left outer join members on movies.id = members.movie_id;

select title, fn, ln, category from movies right outer join members on movies.id = members.movie_id;