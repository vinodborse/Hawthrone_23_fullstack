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

-- JOINS
INNER JOIN
LEFT JOIN
RIGHT JOIN

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

----------------------------


SELECT * FROM batch
INNER JOIN student ON student.batch = batch.id
INNER JOIN marks ON marks.rollno = student.rollno
WHERE batch.name = 'Rose';


-------------------------------------------------

SELECT * FROM student;

INSERT INTO student VALUES 
(4, 'Vinod', 'Pune'),
(5, 'Rahul', 'Pune'),
(6, 'Gaurav', 'Jalgaon'),
(7, 'Anarkali', 'Dhule'),
(8, 'Chameli', 'Dhule'),
(9, 'Dhondu', 'America'),
(10, 'Salmon', 'Faltu gali');



DELETE FROM student WHERE address = 'Surat';

UPDATE student SET name = 'Sonchidi' WHERE name = 'Chameli';
UPDATE student SET address = 'Amalner' WHERE name = 'Dhondu';
UPDATE student SET address = 'Pune' WHERE address = 'Surat';

SELECT * FROM student WHERE rollno = 6;
SELECT address FROM student WHERE rollno = 6;

SELECT * FROM student WHERE rollno IN (6,7, 5, 453, 8,9);
SELECT * FROM student WHERE address IN ('Pune', 'Jalgaon');

SELECT * FROM student WHERE rollno = 6 OR address = 'Pune';

SELECT * FROM student WHERE name = 'Annu' AND address = 'Pune';

SELECT * FROM student LIMIT 5;

SELECT COUNT(*) FROM student WHERE address = 'Pune';
SELECT * FROM student ORDER BY name DESC;
SELECT * FROM student ORDER BY rollno DESC LIMIT 3;
 SELECT * FROM student WHERE rollno % 2 != 0;
 
SELECT COUNT(marathi) 'rows' FROM marks; 
SELECT MAX(gujarati) FROM marks;
SELECT MIN(gujarati) FROM marks;
SELECT AVG(gujarati) FROM marks;

 
INSERT INTO marks VALUES (80, 2, 1), (100, 100, 2), (34, 54, 3), (14, 48, 4), (76, 76, 9), (28, 29, 6), (55, 12, 7), (30, 45, 8); 

INSERT INTO marks(marathi, gujarati) VALUES (34,12), (14,15);


SELECT * FROM student;
SELECT * FROM marks;

SELECT * FROM student ;
SELECT * FROM marks;


SELECT * FROM student INNER JOIN marks ON marks.srn = student.rollno;

SELECT * FROM student LEFT JOIN marks ON marks.srn = student.rollno;

SELECT * FROM student RIGHT JOIN marks ON marks.srn = student.rollno;

SELECT rollno, name, marathi, gujarati FROM student 
INNER JOIN marks ON marks.srn = student.rollno 
WHERE name = 'Sonchidi';

SELECT s.rollno rn, name, marathi, gujarati FROM marks m
INNER JOIN student s ON s.rollno = m.rollno 
WHERE address = 'Pune' 
ORDER BY marathi DESC;


SELECT * FROM marks INNER JOIN student ON student.rollno = marks.rollno
WHERE student.rollno % 2 = 0 LIMIT 2;


ALTER TABLE marks RENAME COLUMN srn TO rollno;




