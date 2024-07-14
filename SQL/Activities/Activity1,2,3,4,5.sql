REM   Script: Session 05
REM   SQL practice for FST sessions

CREATE TABLE Salesman( 
 SALESMAN_ID int, 
SALESMAN_NAME VARCHAR2(20) 
SALESMAN_CITY VARCHAR2(20) 
COMMISSION int 
);

CREATE TABLE Salesman( 
 SALESMAN_ID int, 
SALESMAN_NAME VARCHAR2(20), 
SALESMAN_CITY VARCHAR2(20), 
COMMISSION int);

CREATE TABLE Salesman( 
 SALESMAN_ID int, 
SALESMAN_NAME VARCHAR2(20) 
SALESMAN_CITY VARCHAR2(20) 
COMMISSION int);

CREATE TABLE Salesman( 
 SALESMAN_ID int, 
SALESMAN_NAME VARCHAR2(20), 
SALESMAN_CITY VARCHAR2(20), 
COMMISSION int);

CREATE TABLE Salesman(SALESMAN_ID int,SALESMAN_NAME VARCHAR2(20),SALESMAN_CITY VARCHAR2(20),COMMISSION int);

DESCRIBE salesman


CREATE TABLE salesman(SALESMAN_ID int,SALESMAN_NAME VARCHAR2(20),SALESMAN_CITY VARCHAR2(20),COMMISSION int);

DESCRIBE salesman


DROP TABLE salesman;

CREATE TABLE salesman(SALESMAN_ID int,SALESMAN_NAME VARCHAR2(20),SALESMAN_CITY VARCHAR2(20),COMMISSION int);

DESCRIBE salesman


 INSERT ALL 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5001,'James Hoog', 'New York',15) 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5002,'Nail Knite','Paris',13) 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5005,'Pit Alex','London',11) 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5006,'McLyon','Paris',14) 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5007,'Paul Adam','Rome',13) 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5003,'Lauson Hen','San Jose',12) 
select 1 from dual;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

DROP TABLE salesman;

CREATE TABLE salesman(SALESMAN_ID int,SALESMAN_NAME VARCHAR2(20),SALESMAN_CITY VARCHAR2(20),COMMISSION int);

DESCRIBE salesman


 INSERT ALL 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5001,'James Hoog', 'New York',15) 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5002,'Nail Knite','Paris',13) 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5005,'Pit Alex','London',11) 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5006,'McLyon','Paris',14) 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5007,'Paul Adam','Rome',13) 
into salesman(SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) values (5003,'Lauson Hen','San Jose',12) 
select 1 from dual;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman;

