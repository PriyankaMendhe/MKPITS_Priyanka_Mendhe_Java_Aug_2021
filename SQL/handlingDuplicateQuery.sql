--mkpits_practice(DB)
--HandlingDuplicates

--no such index or primary key, so it would allow duplicate records for first_name and last_name.

CREATE TABLE person_tbl (
   first_name CHAR(20),
   last_name CHAR(20),
   sex CHAR(10)
);

--insert into person_tbl
--duplicate data saved
INSERT INTO `person_tbl` (`first_name`, `last_name`, `sex`) VALUES ('Aman', 'Kumar', 'Male'), ('Aman', 'Kumar', 'male');

--Add primary Key to avoid duplicacy of data
CREATE TABLE person_tbl (
   first_name CHAR(20) NOT NULL,
   last_name CHAR(20) NOT NULL,
   sex CHAR(10),
   PRIMARY KEY (last_name, first_name)
);

--insert data
-- primary key not allowed duplicate data

INSERT INTO `person_tbl1` (`first_name`, `last_name`, `sex`) VALUES ('Aman', 'Kumar', 'Male'), ('AMan', 'Sharma', 'MAle');

--does not error out and at the same time it will not insert duplicate records as well.
INSERT IGNORE INTO person_tbl (last_name, first_name)
   -> VALUES( 'Jay', 'Thomas');

--  REPLACE command rather than the INSERT command.  

 REPLACE INTO person_tbl (last_name, first_name)
     VALUES( 'Ajay', 'Kumar');

--table with unique key
CREATE TABLE person_tbl (
   first_name CHAR(20) NOT NULL,
   last_name CHAR(20) NOT NULL,
   sex CHAR(10)
   UNIQUE (last_name, first_name)
);


--counting & identifying duplicate
SELECT COUNT(*) as repetitions, last_name, first_name
     FROM person_tbl
     GROUP BY last_name, first_name
     HAVING repetitions > 1;

--DISTINCT with SELECT statement to  get unique records available in a table.

  SELECT DISTINCT last_name, first_name
     FROM person_tbl
    ORDER BY last_name;

--group by
SELECT last_name, first_name
    FROM person_tbl
    GROUP BY (last_name, first_name);

-- remove duplicate entry by creating new tmp table
 
  CREATE TABLE tmp SELECT last_name, first_name, sex
 FROM person_tbl;

-- after creating tmp drop originaal table and rename tmp to original table
  DROP TABLE person_tbl;
  ALTER TABLE tmp RENAME TO person_tbl;

-- add primary key to table
ALTER IGNORE TABLE person_tbl
   -> ADD PRIMARY KEY (last_name, first_name);







 


