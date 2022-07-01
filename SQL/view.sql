drop database if exists computer_products;

create database if not exists computer_products;

use computer_products;

drop table if exists products;
create table if not exists products(
pid int primary key,
pname varchar(20),
pprice decimal(10,2),
pstock int
);

insert into products values(101, 'hdd', 5200.00, 10);
insert into products values(102, 'cd', 180.00, 20);
insert into products values(103, 'speaker', 1500.00, 5);
insert into products values(104, 'keyboard', 850.00, 10);
insert into products values(105, 'sd card', 475.00, 0);
insert into products values(106, 'mouse', 450.00, 6);
insert into products values(107, 'joystick', 975.00, 0);

select * from products;

-- view for products whose stocks are over
 create or replace view prod_over as select * from products where pstock = 0;
 select * from prod_over;
 
--  product list with price view
 create view prod_price as select pname "product_name", pprice "product_price" from products;
 select * from prod_price;
 
 -- product list which are storage devices
 create or replace view prod_storage as select pname,pprice from products where pname in ('hdd','cd','sd card');
 select * from prod_storage;
 
-- Top 2 expensive products
 create or replace view prod_top2 as select pname,pprice from products order by pprice DESC limit 2;
 select * from prod_top2;