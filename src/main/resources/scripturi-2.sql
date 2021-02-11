CREATE SCHEMA IF NOT EXISTS biblioteca;

USE biblioteca;


CREATE TABLE authors
(
    id   INT(5) PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    birth_date DATE
);

CREATE TABLE books
(
    id   INT(5) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    isbn VARCHAR(100),
    author_id INT(5),
    FOREIGN KEY (author_id) references authors(id)
);


INSERT INTO authors (first_name, last_name, birth_date)
VALUES ('Ion', 'Creanga', '1837-03-01');

INSERT INTO authors (first_name, last_name, birth_date)
VALUES ('Mihai', 'Eminescu', NOW());

INSERT INTO books (name, isbn, author_id)
VALUES ('Iarna pe ulita', '15s4da5sd4sa', 1);

INSERT INTO books (name, isbn, author_id)
VALUES ('Volum poezii 1', '152132135sd4sa', 2);

INSERT INTO books (name, isbn, author_id)
VALUES ('Volum poezii 2', '15sd4sa', 2);


DELETE FROM authors WHERE id > 2;

SELECT * FROM authors;
SELECT * FROM books;


SELECT b.id, b.name, a.id, a.first_name FROM books as b, authors a
                                                             LEFT JOIN authors a on b.author_id = a.id;

SELECT b.id, b.name, a.id, a.first_name FROM books as b
                                                 LEFT JOIN authors a ON b.author_id = a.id;


SELECT b.id, b.name, a.id, a.first_name FROM books as b
                                                 JOIN authors a;


CREATE TABLE IF NOT EXISTS authors2 (id int(3) PRIMARY KEY AUTO_INCREMENT, name varchar(64), email varchar(64) UNIQUE );

insert into authors2 (name, email) values ('Georgel Ionescu', 'georgel.io1ne1scu2@gmail.com');



# PRIMARY KEY == UNIQUE + NOT NULL


CREATE TABLE IF NOT EXISTS books (id int(3), name varchar(64), author_id varchar(64));

