DROP DATABASE IF EXISTS	extra7;
CREATE DATABASE			extra7;
USE						extra7;

DROP TABLE IF EXISTS	Employee;
CREATE TABLE			Employee(
EmployeeLastName		VARCHAR(50) NOT NULL,
EmployeeFistName		VARCHAR(50) NOT NULL,
EmployeeHireDate		DATE,
EmployeeStatus			VARCHAR(50) NOT NULL,
SupervisorID			TINYINT UNSIGNED UNIQUE NOT NULL,
SocialSecurityNumber	TINYINT UNSIGNED NOT NULL
);

DROP TABLE IF EXISTS	Project;
CREATE TABLE			Project(
ProjectID			TINYINT	UNSIGNED AUTO_INCREMENT PRIMARY KEY,
ManagerID			TINYINT UNSIGNED UNIQUE NOT NULL,
ProjectName			VARCHAR(50) NOT NULL,
projectStartDate	DATE NOT NULL,
ProjectDescription	VARCHAR(50) NOT NULL,
ProjectDetailt		VARCHAR(50) NOT NULL,
ProjectCompletedOn	VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS	Project_modules;
CREATE TABLE			Project_modules(
ModuleID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
ProjectID			TINYINT UNSIGNED,
EmployeeID			TINYINT UNSIGNED UNIQUE NOT NULL,
ProiectModulesDate	DATE,
ProjectModulesCompledOn	VARCHAR(50) NOT NULL,
ProjectModulesDescription VARCHAR(50) NOT NULL,
FOREIGN KEY	(EmployeeID) REFERENCES	Employee(EmployeeID) ON DELETE CASCADE,
FOREIGN KEY	(ProjectID) REFERENCES	Project(ProjectID) ON DELETE CASCADE
);

DROP TABLE IF EXISTS	Work_Done;
CREATE TABLE			Work_Done(
WorkDoneID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
EmployeeID				TINYINT UNSIGNED NOT NULL,
ModuleID				TINYINT UNSIGNED NOT NULL,
WorkDoneDate			DATE,
WorkDoneDescription		VARCHAR(50) NOT NULL,
WorkDoneStatus			VARCHAR(50) NOT NULL,
FOREIGN KEY	(EmployeeID) REFERENCES	Employee(EmployeeID) ON DELETE CASCADE,
FOREIGN KEY	(ModuleID) REFERENCES	Project_modules(ModuleID) ON DELETE CASCADE
);

