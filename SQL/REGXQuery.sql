 
--person_tbl and it is having a field name  

--Query to find all the names starting with 'st'  

 SELECT name FROM person_tbl WHERE name REGEXP '^st';


--query to find records from employees table whose town is starting with 'par'
SELECT * FROM employees WHERE town REGEXP '^par'

--query to find those employee whose name starts with 'b'
SELECT * FROM employees WHERE town REGEXP  '^par'


--Query to find all the names ending with 'ok' 

SELECT name FROM person_tbl WHERE name REGEXP 'ok$';

--query to find employees whose town name ends with 'don'
SELECT * FROM `employees` WHERE town REGEXP 'don$'

--query to find employees whose name ends with 'ry'
SELECT * FROM `employees` WHERE name REGEXP 'ry$'


--Query to find all the names, which contain 'mar' 

SELECT name FROM person_tbl WHERE name REGEXP 'mar';

--query to find employee records whose name contains 'ro'
SELECT * FROM `employees` WHERE name REGEXP 'ro'

--query to find employee record whose name starts with 'e' and ends with 'na'
SELECT * FROM `employees` WHERE name REGEXP '^e' and name REGEXP 'na$'

--Query to find all the names starting with a vowel and ending with 'ok'  
SELECT * FROM `employees` WHERE name REGEXP '^a' or name REGEXP '^e'  and name REGEXP 'na$' 

