--concurrency
--mkpits_practice(DB)
--info_table

CREATE TABLE info_table (   
        Id INT NOT NULL AUTO_INCREMENT,   
        Name VARCHAR(50) NOT NULL,   
        Message VARCHAR(80) NOT NULL,  
        PRIMARY KEY (Id)   
    );  

--connect to current connection id
SELECT CONNECTION_ID();


--insert record
INSERT INTO info_table (name, message) VALUES('Peter', 'Hi'), ('Joseph', 'Hello'), ('Mark', 'Welcome');

--before lock

SELECT * FROM info_table;  

--lock unable to insert becoz lock

LOCK TABLE info_table READ;

 INSERT INTO info_table (name, message)   
    VALUES ('Suzi', 'Hi');  



