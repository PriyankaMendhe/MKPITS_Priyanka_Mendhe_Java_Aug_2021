-- id as not null with auto-increment

CREATE TABLE insect ( id INT UNSIGNED NOT NULL AUTO_INCREMENT, PRIMARY KEY (id), name VARCHAR(30) NOT NULL, date DATE NOT NULL, origin VARCHAR(30) NOT NULL);

-- insert into insect

INSERT INTO insect (id,name,date,origin) VALUES (NULL,'housefly','2001-09-10','kitchen'), (NULL,'millipede','2001-09-10','driveway'), (NULL,'grasshopper','2001-09-10','front yard');

--select insect table

SELECT * FROM insect ORDER BY id;

--to renumber the id values 

ALTER TABLE insect DROP id;

ALTER TABLE insect ADD id INT UNSIGNED NOT NULL AUTO_INCREMENT FIRST, ADD PRIMARY KEY (id);

-- change sequence of auto increment by intialise as any number

INSERT INTO insect (id,name,date,origin) VALUES (100,'fly1','2001-09-10','kitchen'), (NULL,'millipede','2001-09-10','driveway');

-- set Auto-increment by alter
ALTER TABLE insect AUTO_INCREMENT = 200;

