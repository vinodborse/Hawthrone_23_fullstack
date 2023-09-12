CREATE DATABASE <database_name>;

SHOW DATABASES;

USE <database_name>;

CREATE TABLE <table_name>(<column_name> <data_type> );

SELECT <columan_name> FROM <table_name>;

INSERT INTO <table_name>(<columan_name>) VALUE (<columan_value>) 
 

-------------------------------
CREATE DATABASE testingshastra;

USE sample_4_ts;

CREATE TABLE student(rollno int, name varchar(50), address varchar(50));

SELECT rollno, name, address FROM student;

INSERT INTO student(rollno, name, address) VALUE (1, 'Hukalala', 'Bavuma');