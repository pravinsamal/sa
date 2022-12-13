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