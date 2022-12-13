create database e_scholar;
use e_scholar;

-- > Admin table  
create table Admin(
user_id int auto_increment not null unique,
username varchar(30) not null unique,
password varchar(20) not null,
email varchar(30) not null unique,
primary key(email)
);

-- > Student Table 
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

-- > Teacher Table
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

-- > Activity log Table
create table Admin_Audit(
emp_id varchar(10),
date varchar(100),
status varchar(20));

-- > Cient messege table
create table clientchats(
chats varchar(200)
);

-- > Server/Admin message table
create table serverchats(
chats varchar(200)
);

-- > Student attendance Table
create table std_attend (
attend_date date,
std_id integer(10) not null unique,
std_name varchar(30),
std_batch varchar(20) ,
std_book varchar(20) ,
std_status varchar(20),
foreign key(std_id ) references AddStudent(std_id)
);

-- > Inserting some details into following tables

insert into Admin(username,password,email) values("ram","ram","ram@ram.com");
insert into Admin(username,password,email) values("rama","rama","rama@ram.com");

insert into std_attend values ('2022-12-08', 1, 'kryss', 'Batch 32A','HTML','Present');
insert into std_attend values ('2022-12-08', 2, 'Ram', 'Batch 32A','Java','Absent');
insert into std_attend values ('2022-12-08', 3, 'Hari', 'Batch 32A','CSS','Present');
insert into std_attend values ('2022-12-08', 4, 'Gopal', 'Batch 32A','Python','Absent');
insert into std_attend values ('2022-12-08', 5, 'Mukesh', 'Batch 32A','CPP','Absent');
insert into std_attend values ('2022-12-08', 6, 'Sunil', 'Batch 32A','Java','Present');
insert into std_attend values ('2022-12-08', 7, 'Sagar', 'Batch 32A','Python','Present');

insert into AddStudent(FirstName,SurName,DOB,Email,Contact,Address,Gender,Std_batch,Username,Password) values("Kryss","Na","2055-05-05","kryss@gmail.com","9811787878","kathmandu","Male","Batch 32A","Scholar101","Scholar101");
insert into AddStudent(FirstName,SurName,DOB,Email,Contact,Address,Gender,Std_batch,Username,Password) values("Kritima","Khatri","2056-05-05","kritima@gmail.com","986555566","kathmandu","Female","Batch 32A","Scholar102","Scholar102");
insert into AddStudent(FirstName,SurName,DOB,Email,Contact,Address,Gender,Std_batch,Username,Password) values("Prosiya","Shrestha","2056-06-05","prosiya@gmail.com","9811355510","Kathmandu","Female","Batch 32A","Scholar103","Scholar103");
insert into AddStudent(FirstName,SurName,DOB,Email,Contact,Address,Gender,Std_batch,Username,Password) values("Slesha","Dahal","2057-05-05","Slesha@gmail.com","9864831000","kathmandu","Female","Batch 32A","Scholar104","Scholar104");
insert into AddStudent(FirstName,SurName,DOB,Email,Contact,Address,Gender,Std_batch,Username,Password) values("Sagar","Acharya","2056-05-08","sagar@gmail.com","9811784546","kathmandu","Male","Batch 32A","Scholar105","Scholar105");
insert into AddStudent(FirstName,SurName,DOB,Email,Contact,Address,Gender,Std_batch,Username,Password) values("Krishna","Acharya","2057-07-08","krishna@gmail.com","9811787885","kathmandu","Male","Batch 32A","Scholar106","Scholar106");

-- > query to alter table or details
select * from Admin;
select * from AddTeacher;
select * from AddStudent order by std_id asc;
select * from std_attend;
drop table Admin;
drop table std_attend;
drop table AddStudent;
drop table AddTeacher;

select AddStudent.std_id  ,CONCAT(AddStudent.firstname,' ',AddStudent.Surname)as Name,AddStudent.Std_batch , std_attend.std_status 
from AddStudent left join std_attend on AddStudent.Std_id=std_attend.Std_id;

select AddStudent.std_id ,CONCAT(AddStudent.firstname,' ',AddStudent.Surname)as Name,
 AddStudent.Std_batch as Batch , std_attend.std_status as Attendance from AddStudent
 left join std_attend on AddStudent.Std_id=std_attend.Std_id order by Std_id asc;
           
            



