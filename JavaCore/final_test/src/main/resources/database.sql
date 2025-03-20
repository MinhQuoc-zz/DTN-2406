DROP DATABASE IF EXISTS final_exam04;
CREATE DATABASE final_exam04;
USE final_exam04;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
	id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(50) 		NOT NULL,
    email VARCHAR(50) UNIQUE KEY NOT NULL,
    password VARCHAR(50) NOT NULL DEFAULT '123456Q',
    role ENUM('MANAGER','EMPLOYEE') NOT NULL DEFAULT 'EMPLOYEE',
    exp_in_year INT,
    project_id INT ,
	pro_skill VARCHAR(50)
);

INSERT INTO users (full_name, email, password, role,            project_id, exp_in_year,pro_skill)
VALUES ('Nguyễn Văn Khoa','khoa@gmail.com','123456Q','MANAGER',		1,  10 ,    NULL),
		('Nguyễn Ngọc Duy','duy@gmail.com','123456Q','EMPLOYEE',	4,  NULL,   'Dev'),
         ('Nguyễn Minh Quốc','quoc@gmail.com','123456Q','MANAGER',	2,  8 ,     NULL ),
          ('Nguyễn Văn A','a@gmail.com','123456Q','MANAGER',		1,  9 ,     NULL ),
          ('Nguyễn Ngọc B','c@gmail.com','123456Q','EMPLOYEE',		2,  NULL,   'java'),
          ('Nguyễn Ngọc C','d@gmail.com','123456Q','EMPLOYEE',		3,  NULL,   'sql');

DROP PROCEDURE IF EXISTS find_by_email_and_password;
DELIMITER $$
CREATE PROCEDURE find_by_email_and_password(
	IN in_email VARCHAR(50),
    IN in_password VARCHAR(50)
)
BEGIN
	SELECT *
    FROM users
    WHERE email = in_email AND password = in_password;
END $$
DELIMITER users;