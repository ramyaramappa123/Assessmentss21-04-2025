create table students(
sid int primary key,
sname varchar(20) not null,
email varchar(50),
age int,
marks numeric(10,2)
)
insert  into students values(1,'ramya','ramya@gmail.com',21,67)
insert  into students values(2,'souju','souju@gmail.com',27,96)
insert  into students values(3,'renu','renu@gmail.com',14,66)
insert  into students values(4,'shifa','shifa@gmail.com',20,55)
insert  into students values(5,'vedha','vedha@gmail.com',16,72)


select*from students

select* from students where age>21
select*from students

update students set email='rahul@gmail.com' where sid=5
select*from students

select s.*from students s where 1=(select count(marks) from student  where marks2> marks1

delete from students where age<18
select*from students


create table student(
ssid int primary key,
sname varchar(20),
sage int
)

insert into student values(1,'Rahul',22)
insert into student values(2,'Priya',21)
insert into student values(3,'Akash',23)
select*from student

create table courses(
cid int,
courses varchar(20),
ssid int,
foreign key(ssid) references student(ssid)

) 
insert into courses values(101,'Java',1)
insert into courses values(102,'Python',2)
insert into courses values(103,'SQL',1)

select*from courses

select sname s,courses c from student s inner join courses c on  cid=ssid





