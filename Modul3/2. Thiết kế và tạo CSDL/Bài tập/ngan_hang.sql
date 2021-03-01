create database bai_tap_2;
use bai_tap_2;
create table customers
(customer_number int not null auto_increment primary key,
full_name varchar(30),
address varchar(30),
email varchar (30),
phone int (10)
);
create table accounts
(   account_number int auto_increment primary key,
	account_types varchar(30),
    open_date date,
    blance double,
    customer_number int,
    foreign key (customer_number) references customers(customer_number)
);
create table transactions
(tran_number int primary key,
tran_date date,
amount double,
descriptions varchar(50),
account_number int,
foreign key (account_number) references accounts(account_number)
);
