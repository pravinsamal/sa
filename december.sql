create table example (no int, name char(10),surname char (10),mobile int ,gender char(1))

create table example1 (no int, name char(10),surname char (10),mobile int ,gender char(1))




select * from example1


create table pravin  ( f_n char(10), s_n char(10), mob int ,email varchar ,city char(20))

create table emp (ID int ,name varchar(255), salary int ,Grade varchar (255))

create table pravin (first_name char(10) ,last_name char (10) ,mobile_number int ,email varchar(20), city char (10))

select * from pravin

create table imp (id varchar(10) , name char (10), salary int ,grade varchar (5));

select * from imp



create table pravin1 (id int ,name char(20), surename char(20),mobile int )

select * from pravin1

select * from pravin1


insert into pravin1 values ( 1002,'rohit', 'samal',8657010102)

insert into pravin1 values (1003, 'sam', 'sam' , 4567891230)

1select * from  pravin1

insert into pravin1 values (1004, 'vinay' ,'gadagi', 7895461230)

select * from pravin1

select name from pravin1

select mobile from pravin1

select distinct id from pravin1 
select * from pravin1

INSERT INTO pravin1  VALUES (1001,'parvin','das', 4561237890)

select distinct name from pravin1

select *from pravin1 order by id




select * from pravin1 order by id desc

select top 3 from pravin1

select * from pravin1 where RowNum<=2


select * from pravin1 where RowNum<=3


select * from pravin1 where id=1002

select * from pravin1 where id=1001
select * from pravin1 order by id desc

select  top 3 from pravin1

select * from pravin1 where RowNum<=3
select * from pravin1 where rownum<=3

select * from pravin1 where id=1001
select * from pravin where id in(1,2)


create table emp1(emp_id int ,F_N char(10),L.N char(10),city char(10),salary int,mob_num int)

create table pravin (first_name char(10) ,last_name char (10) ,mobile_number int ,email varchar(20), city char (10))

create table pen(first_name char(10),last_name char(10),age int,mobile_namuber int,email varchar(20),city char(10));

insert into pen values ('pravin','samal',24,8180817855,'samalpravin0405@gmail.com','solapur')

alter table pen modify email varchar(30)

insert into pen values ('rohit','samal',23,8657010102,'rohitsamal1010@gmail.com','solapur')
insert into pen values ('ram','alagi',23,8657010782,'ramalagi@gmail.com','pune')
insert into pen values ('vinay','kumbar',25,7894561230,'viany@gmail.com','dheli')
insert into pen values ('suraj','putta',30,1234567890,'suraj@gmail.com','latur')

alter table pen add id int
select * from pen;
update pen  set id=1 where age=24

update pen set id=2 where age=23 and city='solapur';
update pen set id=3 where first_name='ram'
update pen set id=4 where first_name='vinay'
update pen set id=5 where first_name='suraj'

select * from pen;
select city from pen;
select distinct city from pen;
select *from pen order by id desc

select *from pen order by id ;

select * from pen where rownum<=3;

select * from pen  where id=1
select * from pen where id in(1,2)
select * from pen where id in (1,2,3,4);
select * from pen where id between 1 and 4;

select * from pen where id between 1 and 3

select id as num from pen
select * from pen;

select * from pen where id=1 and  age=24;

select * from pen where id=1 or age =24
select * from pen where first_name like'p%'

select * from pen where first_name like 'r%'
;

update pen set city='nagpur' where id=2
update pen set city ='solapur' where id=2;
create table pencile as select * from pen
select * from pencile;
delete from pencile
drop table pencile
select * from pencile
delete from pencile 
drop table pencile
truncate table pencile
rollback pencile
select * from pen
update pen set city='pune' where age=24

alter table pen add sex char
alter table pen drop column sex
alter table pen modify city varchar(20) 