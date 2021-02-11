SELECT * FROM db_licenta.utilizatori; /* dfsdfsd*/

-- dsdsdfsdfs
CREATE SCHEMA books;
USE books;

CREATE TABLE IF NOT EXISTS authors (id int(3), name varchar(64), email varchar(64));
show tables;
describe authors;
insert into authors (id, name, email) values (1, 'Georgel Ionescu', 'georgel.ionescu@gmail.com');

insert into authors (id, name) values (1, 'Georgel Ionescu');

select * from authors;
select count(*) as 'numberOfEntries' from authors;

# ADDDATE()

SELECT avg(id) from authors;

SELECT * from authors where id in (1,2);
SELECT * from authors where id not in (1,2);
SELECT * from authors where id not between 1 and 2;
SELECT * from authors where id between 1 and 2;
SELECT * from authors where authors.email in ('georgel.ionescu@gmail.com');
SELECT * from authors where authors.email like ('geo%ion%.com');


SELECT MIN(name) from authors;

