create database thietkevataoCSDL;
use  thietkevataoCSDL;
CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);
insert into contacts
values
(1, "phuc", "nguyen", "1989-01-06");