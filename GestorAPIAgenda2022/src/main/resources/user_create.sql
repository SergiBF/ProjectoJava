CREATE SCHEMA `agenda2022` ;

USE mysql;

CREATE USER 'it2022'@'localhost' IDENTIFIED BY 'it123';

GRANT ALL PRIVILEGES ON agenda2022.* TO 'it2022'@'localhost';
FLUSH PRIVILEGES;

GRANT ALL PRIVILEGES ON test_db.* TO 'it2022'@'localhost';
FLUSH PRIVILEGES;
