create database e_scholar;
use e_scholar;

create table Admin(
user_id int auto_increment not null unique,
username varchar(30) not null unique,
password varchar(20) not null,
email varchar(30) not null unique,
primary key(email)
);
drop table Admin;

create table AddStudent_user(
id int(10),
username varchar(30),
password varchar(20),
division varchar(20)
);

create table AddStudent(
std_id int(200) auto_increment not null unique ,
FirstName varchar(20),
SurName varchar(20),
DOB date,
Email varchar(20) not null unique,
Contact varchar(10) not null unique,
Address varchar(20),
Gender varchar(20),
Std_batch varchar(15),
Username varchar(20) not null unique,
Password varchar(20),
primary key(Email)

);

create table AddTeacher(
Teacher_id int(200) auto_increment not null unique ,
FirstName varchar(20),
SurName varchar(20),
DOB date,
Email varchar(20) not null unique,
Contact varchar(10) not null unique,
Address varchar(20),
Gender varchar(20),
Course_name varchar(15),
Username varchar(20) not null unique,
Password varchar(20),
primary key(Email)
);

create table Admin_Audit(
emp_id varchar(10),
date varchar(100),
status varchar(20));
select * from AdminDash_AddStudent;
select * from Admin;
drop table AddStudent;
drop table AddTeacher;


create table clientchats(

chats varchar(200)

);

create table serverchats(


chats varchar(200)

);

create table std_attend (
attend_date date,
std_id integer(10) not null unique,
std_name varchar(30),
std_batch varchar(20) ,
std_book varchar(20) ,
std_status varchar(20),
foreign key(std_id ) references AddStudent(std_id)
);

select * from Admin;
select * from AddTeacher;

select * from AddStudent;

drop table AddStudent;

drop table std_attend;



insert into Admin(username,password,email) values("ram","ram","ram@ram.com");
insert into Admin(username,password,email) values("rama","rama","rama@ram.com");


insert into std_attend values ('2022-12-08', 1, 'kryss', 'Batch 32A','HTML','Present');
insert into std_attend values ('2022-12-08', 2, 'Ram', 'Batch 32A','Java','Absent');
insert into std_attend values ('2022-12-08', 3, 'Hari', 'Batch 32A','CSS','Present');
insert into std_attend values ('2022-12-08', 4, 'Gopal', 'Batch 32A','Python','Absent');
insert into std_attend values ('2022-12-08', 5, 'Mukesh', 'Batch 32A','CPP','Absent');
insert into std_attend values ('2022-12-08', 6, 'Sunil', 'Batch 32A','Java','Present');

insert into std_attend values ('2022-12-08', 7, 'Sagar', 'Batch 32A','Python','Present');






