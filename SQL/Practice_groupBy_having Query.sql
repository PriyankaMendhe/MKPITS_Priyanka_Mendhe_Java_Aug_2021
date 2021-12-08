-- table Employee
--DB Mkpits_practice
--Insert into Employees

INSERT INTO `employees` (`EMP_NO`, `TOWN`) VALUES ('2', 'Paris'), ('6', 'Paris'), ('7', 'Paris'), ('8', 'London'), ('27', 'New York'), ('28', 'Tokyo'), ('39', 'Paris'), ('44', 'London'), ('57', 'Paris'), ('83', 'Paris'), ('95', 'Soul'), ('100', 'Paris'), ('104', 'New York'), ('112', 'Chicago');

--select from employee
select EMP_NO,TOWN from EMPLOYEES;

-- insert into department
INSERT INTO `departments` (`DEPT_NO`, `EMP_NO`, `DIVISION`) VALUES ('1', '6', 'FIRST'), ('2', '27', 'SECOND');

--select from department
select * from DEPARTMENTS;

--inner join game, employee and Division
SELECT P.TOWN, T.DIVISION, SUM(WON) FROM (GAMES AS M INNER JOIN EMPLOYEES AS P ON M.EMP_NO = P.EMP_NO) INNER JOIN DEPARTMENTS AS T ON M.DEPT_NO = T.DEPT_NO GROUP BY P.TOWN, T.DIVISION ORDER BY P.TOWN;

--- payment table
select * from PAYMENTS;

--Games table
select * from GAMES;

-- join department & Games
SELECT T.DEPT_NO, DIVISION, SUM(WON) FROM DEPARTMENTS AS T, GAMES AS M WHERE T.DEPT_NO = M.DEPT_NO GROUP BY T.DEPT_NO, DIVISION;

-- show name from employees
select NAME from

 EMPLOYEES;

--Group the employees on the length of their names and get the num- ber of employees for each length.
 SELECT   LENGTH(RTRIM(NAME)), COUNT(*) 
FROM     EMPLOYEES 
GROUP BY LENGTH(RTRIM(NAME)) 


--difference between the number of sets won and lost, and group the matches on that difference on game table
SELECT   ABS(WON - LOST), COUNT(*) 
FROM     GAMES 
GROUP BY ABS(WON - LOST) 

--Committe table

select * from COMMITTEE;

--For each combination of year-month in the COMMITTEE_ MEMBERS table, get the number of committee members who --started in that year and that month.

SELECT   YEAR(BEGIN_DATE), MONTH(BEGIN_DATE), COUNT(*)
FROM     COMMITTEE
GROUP BY YEAR(BEGIN_DATE), MONTH(BEGIN_DATE)
ORDER BY YEAR(BEGIN_DATE), MONTH(BEGIN_DATE)

--For each employee who has incurred more than $150 in total payments, find the employee number and the total --amount of payments.


SELECT   EMP_NO, SUM(AMOUNT) 
FROM     PAYMENTS 
GROUP BY EMP_NO 
HAVING   SUM(AMOUNT) > 150 

--For each employee who is a captain and who has incurred more than $80 in total payments, find the employee --number and the total amount of payments.

SELECT   EMP_NO, SUM(AMOUNT) 
FROM     PAYMENTS 
WHERE    EMP_NO IN 
          (SELECT   EMP_NO 
           FROM     DEPARTMENTS) 
GROUP BY EMP_NO 
HAVING   SUM(AMOUNT) > 80

--In which town do more than four employees live?
SELECT   TOWN 
FROM     EMPLOYEES 
GROUP BY TOWN 
HAVING   COUNT(*) > 4 

--Get the employee number and the total amount of payments for the employee with the highest payment total.

SELECT   EMP_NO, SUM(AMOUNT) 
FROM     PAYMENTS 
GROUP BY EMP_NO 
HAVING   SUM(AMOUNT) >= ALL 
         (SELECT   SUM(AMOUNT) 
           FROM     PAYMENTS 
          GROUP BY EMP_NO)

