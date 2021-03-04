create database demo;
use demo;
create table products
(id int auto_increment not null primary key,
productCode varchar(45),
productName varchar(45),
productPrice double,
productAmount double,
productDescription varchar(45),
productStatus varchar(45)
);
INSERT INTO `demo`.`products` (`id`, `productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`) VALUES ('1', 'DT', 'Iphone XS', '1000', '4', 'New', 'Con');
INSERT INTO `demo`.`products` (`id`, `productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`) VALUES ('2', 'DT1', 'Samsung', '800', '12', 'Like new ', 'Con');
INSERT INTO `demo`.`products` (`id`, `productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`) VALUES ('3', 'TB', 'Dell', '2000', '40', 'New', 'Con');
INSERT INTO `demo`.`products` (`id`, `productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`) VALUES ('4', 'HP', 'Sony', '80', '24', 'New', 'Con');
create unique index index_code
on products (productCode);
create  index index_composite
on products(productName, productPrice);

create view view_demo
as 
select productCode, productName,productPrice,productStatus 
from products;

select * from view_demo;

Delimiter $$
create procedure findAll()
begin
select*from products;
end ; $$
delimiter ;

call findAll();

delimiter $$
create procedure addProduct()
begin
insert into products(`id`, `productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`)
value (5,'Mouse','Fullhen', '20', '100', 'New', 'Con');
end; $$
delimiter ;
call addProduct();