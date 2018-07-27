--select * from APP.APP_USER

CREATE TABLE APP.DEPARTMENT
    (ID INT PRIMARY KEY,
    NAME VARCHAR(30));
    
    INSERT INTO APP.DEPARTMENT
      VALUES (5, 'IT');
    SELECT * FROM APP.DEPARTMENT;
    
  CREATE TABLE APP.EMPLOYEE
    (ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    FIRST_NAME VARCHAR(30),
    LAST_NAME VARCHAR(20),
    EMAIL VARCHAR(30),
    DEP_ID INT,
    MOB_NUMBER VARCHAR(10),
    SALARY DECIMAL(5,2),
    ROLE INT,
    STATUS CHAR(1));
 
    INSERT INTO APP.EMPLOYEE(FIRST_NAME,LAST_NAME,EMAIL,DEP_ID,MOB_NUMBER,SALARY,ROLE,STATUS) 
    VALUES('TANVIR2','ANSARI2','wasimkhan03@gmail.com',5,'9993432145',350,1,'Y')
    --DROP TABLE APP.EMPLOYEE;  
    
    select * from app.employee;
    ----------------------------------------------------------------
    CREATE  TABLE APP.users (
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(45) NOT NULL ,
  enabled SMALLINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));
    
    INSERT INTO app.users(username,password,enabled)
VALUES ('wasim','1234', 1);
INSERT INTO app.users(username,password,enabled)
VALUES ('khan','khan', 1);
    
Select * from app.users

ALTER TABLE APP.USERS ALTER "PASSWORD" SET DATA TYPE VARCHAR(150);


update APP.USERS set PASSWORD='$2a$10$V9RJa0sM.0EWrEpXNTnb9eXqYvgn94od98YSrvZRsdvdE9GhjH1vW'
where username='khan'


 ----------------------------------------------------------------------
 
 CREATE TABLE APP.user_roles (
  user_role_id int NOT NULL  GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE (role,username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES APP.users (username));
  
  INSERT INTO APP.user_roles (username, role)
VALUES ('wasim', 'ROLE_USER');
INSERT INTO APP.user_roles (username, role)
VALUES ('khan', 'ROLE_ADMIN');
INSERT INTO APP.user_roles (username, role)
VALUES ('khan', 'ROLE_USER');
select * from app.user_roles;

-------------------------------------------------------------------------
CREATE  TABLE APP.POSTS (
  ID INT NOT NULL ,
  CONTENT VARCHAR(145)  ,
  DESCRIPTION VARCHAR(50)  ,
  LAST_UPDATED_Y TIMESTAMP,
  POSTED_AT_Y TIMESTAMP,
  TITLE VARCHAR(50) ,
  PRIMARY KEY (ID));


  ---------------------------------------------------------------------
--- COUNT NUMBER OF EMPLOYEE IN HR DEPARTMEN
SELECT * FROM APP.EMPLOYEE
SELECT count(E.ID),D.NAME from APP.EMPLOYEE E inner JOIN APP.DEPARTMENT D ON E.DEP_ID=D.ID 
 AND D.NAME='ACCOUNT' group by D.NAME
select * from APP.DEPARTMENT
---------------------------- COURSE TABLE-----------------------
CREATE TABLE APP.COURSE
    (COURSE_ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    COURSE_NAME VARCHAR(30),
    DESCRIPTION VARCHAR(20),
    COURSE_FEE DECIMAL(5,2));

select * from APP.COURSE
DROP table app.course;
insert into app.course(COURSE_NAME,DESCRIPTION,COURSE_FEE) values("JAVA", "JAVA Framework",100.22)
----------------------------------------------------------------
	---------	 tables category and product:-----------
	
CREATE TABLE app.category (
  category_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
  Name varchar(45) NOT NULL
)
 
CREATE TABLE APP.PRODUCT (
  product_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  name varchar(45) NOT NULL,
  description varchar(512) NOT NULL,
  price float NOT NULL,
  category_id int NOT NULL,
  CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES APP.category (category_id)
)
------------ONE TO ONE MAPPING--------------

CREATE TABLE app.ANIMAL (
  ANIMAL_ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
  TYPE varchar(45) NOT NULL,
  TOTAL_NO INT
)

CREATE TABLE app.CAGE (
  CAGE_ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
  CAGE_NO INT,
  LOCATION VARCHAR(30),
  ANIMAL_ID INT,
  CONSTRAINT fk_ANIMAL FOREIGN KEY (ANIMAL_ID) REFERENCES APP.ANIMAL (ANIMAL_ID)
)


------------Users Note example-------------

CREATE TABLE app.USER_INFO (
  EMAIL varchar(50) PRIMARY KEY ,
  PASSWORD varchar(45) NOT NULL,
  CREATE_TIME DATE,
  LAST_UPDATE_TIME DATE
)

insert into app.USER_INFO(EMAIL,PASSWORD,CREATE_TIME,LAST_UPDATE_TIME) values('raj@gmail.com', 'pass',current date,current date)

SELECT * FROM APP.USER_INFO;
CREATE TABLE app.NOTES (
  TITLE varchar(30) PRIMARY KEY ,
  NOTE varchar(1000),
  EMAIL varchar(50),
  CREATE_TIME DATE,
  LAST_UPDATE_TIME DATE,
  CONSTRAINT fk_USERINFO FOREIGN KEY (EMAIL) REFERENCES APP.USER_INFO (EMAIL)
)
SELECT * FROM app.NOTES

------------------------------------------------------------------------------------------

CREATE TABLE app.PRACTICE (
  TITLE varchar(30)  ,
  FNAME varchar(30),
  LNAME varchar(30),
  AGE INT,
  EMAIL varchar(50),
  CREATE_TIME DATE,
  SALARY INT
)

-- Find second hieght salary--------

select distinct * from APP.PRACTICE p
where 3=(select count(distinct salary) from app.practice  ap where p.salary<=ap.salary)

-----------------------

insert into app.PRACTICE(TITLE,FNAME,LNAME,AGE,EMAIL,CREATE_TIME,SALARY) values('Java4', 'Imran','khan1',20,'wkhan1@gmail.com',current date,80000)

select * from app.practice order by salary desc

--delete duplicate record
DELETE M1 from app.practice M1, app.practice M2 where M2.fName=M1.fName AND M1.Id>M2.Id;

select fname , count(fname) as duplicates from app.practice 
group by fname 
having count(fname)>1

 select * from (select *, row_number() OVER ( partition by name order by name)
 as rn from app.practice ) dups name rn
 
 -----------------
select * from app.practice

DELETE FROM app.practice
WHERE fname NOT IN
    (SELECT fname FROM app.practice
     GROUP BY fname
     HAVING count(*)>=1)

 DELETE t1 FROM app.practice t1
        INNER JOIN
    app.practice t2 
WHERE
    t1.id < t2.id AND t1.email = t2.email;
    

