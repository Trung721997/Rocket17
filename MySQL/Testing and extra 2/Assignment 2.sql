DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE 		Fresher;
USE						Fresher;
-- Question1: CREATE TABLE Trainee
DROP DATABASE IF EXISTS Trainee;
CREATE TABLE 			Trainee(
TranineeID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
FullName				VARCHAR(30) NOT NULL,
BirthDate				DATE NOT NULL,
Gender					ENUM('make', 'female', 'unknown') NOT NULL,
Et_iq					TINYINT UNSIGNED CHECK(Et_iq <= 20) ,
Et_gmath				TINYINT UNSIGNED CHECK(Et_gmath <= 20),
Et_enghlish				TINYINT UNSIGNED CHECK(Et_enghlish <= 50),
Training_Class			TINYINT UNSIGNED NOT NULL,
Evaluation_Notes		VARCHAR(200)
);

-- Question2: Thêm trường VTI_Account
ALTER TABLE Trainee
ADD COLUMN VTI_Account TINYINT UNSIGNED UNIQUE NOT NULL;	


-- Exercise 2: Data Types (1)
DROP DATABASE IF EXISTS `Data Types 1`;
CREATE TABLE 			`Data Types 1`(
ID						INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`Name`					VARCHAR(30) NOT NULL,
`Code`					VARCHAR(5) NOT NULL,
ModifiedDate			DATETIME NOT NULL
);

-- Exercise 3: Data Types (2)
DROP DATABASE IF EXISTS `Data Types 2`;
CREATE TABLE 			`Data Types 2`(
Id						INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`Name`					VARCHAR(30) NOT NULL,
BirthDate				DATE NOT NULL,
Gender					BIT,
IsDeletedFlag			BIT NOT NULL
);