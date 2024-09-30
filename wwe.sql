 create database bankmanagementsystem;
 
 show databases;
 
 use bankmanagementsystem;
 
 create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20), email varchar(30),  manital_status varchar(20),  address varchar(40),  city varchar(20),  pin varchar(20),  state varchar(30));
 
 show tables;
 
 select * from signup;
 
 create table signupTwo(formno varchar(20),  religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occupation varchar(30),  seniorcitizen varchar(20),  existingaccount varchar(40),  pan varchar(20),  aadhar varchar(20));
 
  select * from signupTwo;

 create table signupthree(formno varchar(20),   accountType varchar(40),  cardnumber varchar(25),  pin varchar(20),  facility varchar(200));

create table login(formno varchar(20), cardnumber varchar(25), pin varchar(20)); 

select * from signupthree;