create database ScholarDB;
use ScholarDB;

create table new_user(
user_username varchar(30) not null unique,
user_pass varchar(20) not null,
user_cpass varchar(20) not null,
user_email varchar(30) not null unique,
primary key(user_email)
);

create table AddStudent_user(
id int(10),
username varchar(30),
password varchar(20),
division varchar(20)
);

create table AdminDash_AddStudent(
std_id int(20)  ,
firtstname varchar(20),
surname varchar(20),
dob varchar(10),
email varchar(20),
telephone bigint(15),
address varchar(20),
gender varchar(20),
address2 varchar(15),
post_code varchar(20),
apartment varchar(20),
course_id bigint(100),
primary key(email)

);
create table Admin_Audit(
emp_id varchar(10),
date varchar(100),
status varchar(20));
select * from student_information;
select * from Audit;
drop table audit;

;

