--Like clause
--show records whose name starts with m and occupation ends --with er
select * from people where name like 'm%' and occupation like '%er'


--records whose name starts with m or occupation ends with --er
select * from people where name like 'm%' or occupation like '%er'