drop database furama_resort;
create database furama_resort;
use furama_resort;
create table `position`(
position_id int primary key,
position_name varchar(45)
);
create table education_degree(
education_degree_id	int primary key,
education_degree_name varchar(45)
);
create table division (
division_id int primary key,
division_name varchar(45)
);
create table `user`(
username varchar(255) primary key,
`password` varchar(255)
);
create table employee (
employee_id varchar(45) primary key,
employee_name varchar(45),
employee_birthday date,
employee_id_card varchar(45),
employee_salary varchar(45),
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int,
education_degree_id int,
division_id int,
-- username varchar(255),
foreign key(position_id) references `position`(position_id),
foreign key(education_degree_id) references education_degree(education_degree_id),
foreign key(division_id) references division(division_id)
-- foreign key(username) references `user`(username)
);
create table `role`(
role_id int primary key,
role_name varchar(255)
);
create table user_role(
role_id int,
username varchar(255),
foreign key(username) references `user`(username),
foreign key(role_id) references `role`(role_id)
);
create table customer_type(
customer_type_id int primary key,
customer_type_name varchar(45)
);
create table customer(
customer_id varchar(45) primary key,
customer_type_id int,
customer_name varchar(45),
customer_birthday date,
customer_gender varchar(45),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(255),
foreign key (customer_type_id) references customer_type(customer_type_id)
);
create table service_type (
service_type_id int primary key,
service_type_name varchar(45)
);
create  table rent_type (
rent_type_id int primary key,
rent_type_name varchar(45),
rent_type_cost double
);
create table service(
service_id int primary key,
service_name varchar(45),
service_area int,
service_cost double,
service_max_people int,
rent_type_id int,
service_type_id int,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors int,
foreign key(service_type_id) references service_type(service_type_id),
foreign key (rent_type_id) references rent_type(rent_type_id)
);
create table contract(
contract_id int primary key,
contract_start_date datetime,
contract_end_date datetime,
contract_deposit double,
contract_total_money double,
employee_id varchar(45),
customer_id varchar(45),
service_id int,
foreign key(employee_id) references employee(employee_id),
foreign key (customer_id) references customer(customer_id),
foreign key (service_id) references service(service_id)
);
create table attach_service(
attach_service_id int primary key,
attach_service_name varchar(45),
attach_service_cost double,
attach_service_unit int,
attach_service_status varchar(45)
);
create table contract_detail(
contract_detail_id int primary key,
contract_id int,
attach_service_id int,
quantity int,
foreign key (contract_id) references contract(contract_id),
foreign key (attach_service_id)  references attach_service(attach_service_id)
);
insert into customer_type values
	(1, 'Diamond'),
	(2, 'Platinium'),
	(3, 'Gold'),
	(4, 'Silver'),
	(5, 'Member');
    insert into position values
	(1, 'Receptionist'),
	(2, 'Service'),
	(3, 'Expert'),
	(4, 'Monitoring'),
	(5, 'Manage'),
	(6, 'President');
    insert into education_degree values
	(1, 'Intermediate level'),
	(2, 'Colleges'),
	(3, 'University'),
	(4, 'Experienced');
    
insert into division values 
	(1, 'Sale-Maketing'),
    (2, 'Administrative'),
	(3, 'Service'),
    (4, 'Manage');
  