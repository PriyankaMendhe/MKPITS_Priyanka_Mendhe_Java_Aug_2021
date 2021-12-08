--mkpits_practice
--Stored_Procedure

--create gs13 procedure for student table
DELIMITER $$

CREATE PROCEDURE gs13 ()
BEGIN
    select * from student;
END;$$

DELIMITER ;

--call

call gs13();

--create gs14() procedure

DELIMITER $$
CREATE PROCEDURE gs14 ()
BEGIN
    select * from student where age>20;
    SELECT COUNT(studentid) as Total_student FROM student;
END;$$
DELIMITER ;

--call
CALL `gs14`();
 
--show record with Limit and IN 
DELIMITER $$

CREATE PROCEDURE gs15 (var1 int)
BEGIN
   select * from student limit var1;
END;$$

DELIMITER ;

--

call gs15(1);

--sample table

--insertdata stored Procedure

DELIMITER $$

CREATE PROCEDURE insertData (
    in_Name varchar(255)
)
BEGIN
    INSERT INTO sample(name)
        VALUES (in_Name);
END;$$

DELIMITER ;

--call insertdata()

call insertdata("Ranjish");


--out procedure

DELIMITER &&  
    CREATE PROCEDURE display_max_age1 (OUT highestage INT)  
    BEGIN  
        SELECT MAX(age) INTO highestage FROM student;   
    END &&  
    DELIMITER ;  

--call display_max_age1(@M)

call display_max_age1(@M);
select @M;

--stored Procedure display_age()

DELIMITER &&  
    CREATE PROCEDURE display_age(INOUT var1 INT)  
    BEGIN  
        SELECT age INTO var1 FROM student  WHERE studentid = var1;   
    END &&  
    DELIMITER ;  

--call display_age()

set @M='2'
call display_age(@M);
select @M

-- diplay stored Procedure

SHOW PROCEDURE STATUS WHERE db = 'mkpits_practice';  






