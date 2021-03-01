create database shop;
use shop;
create table offices
(officeCode varchar(10) not null primary key,
city varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50) not null,
state varchar(50) not null,
country varchar(50) not null,
postalCode varchar(15) not null
);
create table employees
(employeeNumber int not null auto_increment primary key,
lastName varchar(50) not null,
firstName varchar(50) not null,
email varchar(100) not null,
jobTitle varchar(50) not null,
officeCode varchar(10),
foreign key (officeCode) references offices(officeCode),
reportTo int,
foreign key (reportTo) references employees(employeeNumber)
);

create table customers
(customerNumber int auto_increment not null primary key,
customerName varchar(50) not null,
contactLastName varchar(50) not null,
contactFirstName varchar(50) not null,
phone char(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50) not null,
city varchar(50) not null,
state varchar(50) not null,
postalCode char(15) not null,
country varchar(50) not null,
creditLimit double,
salesRepEmployeeNumber int,
foreign key (salesRepEmployeeNumber) references employees(employeeNumber)
);
create table productsLine
(productLine char(50) not null primary key,
textDescription varchar(100),
image varchar(30)
);
create table products
(productCode varchar(15) not null primary key,
productName varchar(70) not null,
productScale varchar(10) not null,
productVendor varchar(50) not null,
productDescription varchar(70) not null,
quantityInStock int not null,
buyPrice double not null,
MSRP double not null,
productLine char(50),
foreign key (productLine) references productsLine(productLine)
);
create table orders
(orderNumber int not null primary key auto_increment,
orderDate date not null,
requiredDate date not null,
shippedDate date not null,
status varchar(15) not null,
comments varchar(50),
quantityOrdered int not null,
priceEach double not null,
customerNumber int,
foreign key (customerNumber) references customers(customerNumber)
);
create table payments
(paymentNumber int  not null,
checkNumber varchar(50)not null,
paymentDate date not null,
amount double not null,
customerNumber int,
foreign key (customerNumber) references customers(customerNumber)
);

create table orderDetails
(orderNumber int,
productCode varchar(15),
foreign key (orderNumber) references orders (orderNumber),
foreign key (productCode) references products(productCode)
 );