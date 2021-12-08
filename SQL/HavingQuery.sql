--Having
--Mkpits DB

--two tables "officers" and "students"

SELECT officers.officer_name, officers.address, students.course_name  
    FROM officers   
    INNER JOIN students  
    ON officers.officer_id = students.student_id;   

-- inner join

select students.student_id, students.student_name,students.course_name,marks.marks
from students inner join marks
on students.student_id = marks.student_id

-- left Outer Join

select students.student_id, students.student_name,students.course_name,marks.marks
from students left outer join marks
on students.student_id = marks.student_id

-- LeFt join
SELECT  officers.officer_name, officers.address, students.course_name  
    FROM officers  
    LEFT JOIN students  
    ON officers.officer_id = students.student_id;  

-- Right Join

SELECT officers.officer_name, officers.address, students.course_name, students.student_name  
    FROM officers  
    RIGHT JOIN students  
    ON officers.officer_id = students.student_id;  



