CREATE DATABASE <database_name>;

SHOW DATABASES;

USE <database_name>;

DROP DATABASE <database_name>;


--------------------------


CREATE TABLE <table_name>(<column_name> <data_type> );

SELECT <columan_name> FROM <table_name>;

INSERT INTO <table_name>(<columan_name>) VALUE (<columan_value>) 

DROP TABLE <table_name>;

TRUNCATE TABLE <table_name>;

	ALTER TABLE <table_name> ADD <new_column_name> <data_type>;
	ALTER TABLE <table_name> DROP <column_name>;
	ALTER TABLE <table_name> MODIFY <column_name> <new_data_type>;
	ALTER TABLE <table_name> RENAME COLUMN <old_column_name> TO <new_column_name>;

 -- CONSTRAINTS
	UNIQUE
	NOT NULL
	PRIMARY KEY ---> UNIQUE + NOT NULL
	FOREIGN
	DEFAULT
	AUTO_INCREMENT

CREATE TABLE <table_name>(<column_name> <data_type> <constraint>);
CREATE TABLE student(rollno int UNIQUE NOT NULL); 	

FOREIGN KEY (<column_name>) REFERENCES <parent_table_name> (<parent_column_name>);

-------------------------------
CREATE DATABASE testingshastra;

USE sample_4_ts;

CREATE TABLE student(rollno int, name varchar(50), address varchar(50));

SELECT rollno, name, address FROM student;

INSERT INTO student(rollno, name, address) VALUE (1, 'Hukalala', 'Bavuma');
