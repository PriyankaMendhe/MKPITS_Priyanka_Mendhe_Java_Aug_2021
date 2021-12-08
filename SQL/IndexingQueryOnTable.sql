--mkpits_practice(DB)
-- create index at the time of table creation

CREATE TABLE t_index(  
       col1 INT PRIMARY KEY,  
       col2 INT NOT NULL,  
       col3 INT NOT NULL,  
       col4 VARCHAR(20),  
       INDEX (col2,col3)   
    );  

-- add new index on another column

CREATE INDEX ind_1 ON t_index(col4);

-- create table student and insert record
INSERT INTO `student` (`studentid`, `firstname`, `lastname`, `class`, `age`) VALUES ('2', 'Mark', 'Boucher', 'EE', '22'), ('3', 'Michael', 'Clark', 'CS', '18'), ('4', 'Peter', 'Fleming', 'CS', '22'), ('5', 'Virat', 'Kohli', 'EC', '23'), ('6', 'Martin', 'Taybu', 'EE', '24'), ('7', 'John', 'Tucker', 'CS', '25');

--student whose class is CS branch

SELECT studentid, firstname, lastname FROM student WHERE class = 'CS';  

--get internal working of select

EXPLAIN SELECT studentid, firstname, lastname FROM student WHERE class = 'CS';

--create index

CREATE INDEX class ON student (class);

   
--indexces of table

SHOW INDEXES FROM student;  

