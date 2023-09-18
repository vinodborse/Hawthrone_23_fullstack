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




-------------------------
DELETE FROM <table_name> WHERE <condition>
DELETE FROM <table_name> WHERE <column_name> = <column_value>;
UPDATE <table_name> SET <column_name> = <new_value> WHERE <column_name> = <column_value>;

IN
OR
AND

LIMIT <count>
ORDER BY <column_name> ASC/DESC;

COUNT()
MIN()
MAX()
AVG()

<column_name> % 2 = 0 ----> This is for even numbers 
<column_name> % 2 != 0 ----> This is for odd numbers



DELETE FROM student WHERE name = 'Gaurav';
DELETE FROM student WHERE rollno = 5;

UPDATE FROM <table_name> WHERE <column_name> = 'Chameli'
UPDATE student SET name = 'Sonchidi' WHERE name = 'Chameli';


SELECT * FROM student;
SELECT * FROM student WHERE rollno = 5;
SELECT name FROM student WHERE rollno = 5;





SELECT * FROM student ORDER BY rollno DESC LIMIT 3;


SELECT * FROM student ORDER BY rollno DESC LIMIT 3 ; 


rollno	name		marathi		gujarati
 8		Sonchidi	  67			45














