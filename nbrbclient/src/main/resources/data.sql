DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id         int(11) NOT NULL AUTO_INCREMENT,
    first_name varchar(255) DEFAULT NULL,
    last_name  varchar(255) DEFAULT NULL

);

INSERT INTO user
values (1, 'Sasha', 'Sheremet'),
       (2, 'Maksim', 'Shelkovich'),
       (3, 'Tatiana', 'Miha'),
       (4, 'Pavel', 'Vysotski');
