create table rip(id int ,first_name char(10), last_name char (10),mobile_num int unique,age int );
insert into rip values(1001,'pravin','samal',8180817855,24);
insert into rip values(1002,'rohit','samal',8180817856,24);
insert into rip values(1003,'vishal','samal',8180817857,24);

create table rip1 as select * from rip;
select * from rip;
select id from rip;
select distinct id from rip;

select id from rip order by id  ;
select id from rip order by id desc;
select * from rip where rownum<=3;
select * from rip where id in(1001,1002);
select * from rip where id between 1001 and 1003;
select * from rip  where id in (1001,1003);
select * from rip where id between 1001 and 1003;

select id as EMP_ID from rip;

select * from rip union select  * from rip1 ;
select * from rip where  id=1001 and age=24;

select * from rip where id=1001 or age=325;

select * from rip where id like ('%1');

update rip set age=25 where id=1001;
delete from rip1
drop table rip1
truncate table rip1;
delete from rip1 where id =1001;
select * from rip2;
create table rip2 as select * from rip;

alter table rip2 add gender char;

update rip2 set gender= 'm' where id=1001;

alter table rip2 drop column gender;  

alter table rip2 modify last_name varchar(10); 

select min(id) from rip2;

select max (id) from rip2;