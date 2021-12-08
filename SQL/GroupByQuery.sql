--GroupBY
--DB(MKpits)


    SELECT address, COUNT(*)  -- show &count address
    FROM   officers            
    GROUP BY address;         

--GROUP BY Clause with SUM function
-- sum working hour by emp-name as show as TotalworkingHour

SELECT emp_name, SUM(working_hours) AS "Total working hours" FROM employees  
GROUP BY emp_name;  

--GROUP BY Clause with MIN function

SELECT emp_name, MIN(working_hours) AS "Minimum working hour"  
    FROM employees  
    GROUP BY emp_name;  

--GROUP BY Clause with MAX function

SELECT emp_name, MAX (working_hours) AS "Minimum working hour"  
    FROM employees  
    GROUP BY emp_name;  

--GROUP BY Clause with AVG function

SELECT emp_name, AVG(working_hours) AS "Average working hour"  
    FROM employees  
    GROUP BY emp_name;  

--






