DROP DATABASE IF EXISTS dbHighscore;

CREATE DATABASE dbHighscore;

USE dbHighscore;

CREATE TABLE tblHighscore (
    fldId INT AUTO_INCREMENT PRIMARY KEY,
    fldScore INT NOT NULL,
    fldName VARCHAR(100)
);

INSERT INTO tblHighscore (fldScore, fldName) VALUES (1234, "Nisse");
INSERT INTO tblHighscore (fldScore, fldName) VALUES (123, "Bosse");
INSERT INTO tblHighscore (fldScore, fldName) VALUES (12, "Nisse");
INSERT INTO tblHighscore (fldScore, fldName) VALUES (345, "Lena");
INSERT INTO tblHighscore (fldScore, fldName) VALUES (5678, "Jane");
