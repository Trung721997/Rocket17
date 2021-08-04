DROP DATABASE IF EXISTS Assignment4;
CREATE DATABASE 		Assignment4;
USE						Assignment4;

-- Question 1: Thêm ít nhất 10 bản ghi vào table
-- Create TABLE Department
DROP TABLE IF EXISTS Department;
CREATE TABLE		 Department(
Department_Number	 TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Department_Name		 VARCHAR(50) UNIQUE NOT NULL
);

-- Create TABLE Employee_Table
DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE 		 Employee_Table(
Employee_Number		 INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Employee_Name		 VARCHAR(50) NOT NULL,
Department_Number	 TINYINT UNSIGNED NOT NULL,
FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);

-- Create TABLE Employee_Skill_Table
DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE		 Employee_Skill_Table(
Employee_Number		 INT UNSIGNED,
Skill_Code			 VARCHAR(15) NOT NULL,
Date_Registered		 DATE NOT NULL,
FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number)
);

-- Question 2: Thêm ít nhất 10 bản ghi vào table
-- Thêm data
INSERT INTO			Department				(Department_Name)
VALUE						  				(  N'Giám Đốc'    	),
											(  N'Thư Ký'     	),
											(  N'Sale'       	),
											(  N'Marketing'  	),
											(  N'Chiến Lược' 	),
											(  N'Tư vấn'   		),
											(  N'Tài Chính'   	),
											(  N'Nhân Sự'   	),
											(  N'Kỹ Thuật'  	),
											(  N'Bảo Vệ'   		);
										
INSERT INTO			Employee_Table			(	 Employee_Name		, 	Department_Number)
VALUE										(	'Nguyen Van Trung'  ,		1			),
											(	'Nguyen Van Cuong'  ,		2			),
											(	'Nguyen Van Minh'	,		3			),
											(	'Nguyen Ba THuc'	,		4			),
											(	'Nguyen Van Bac'	,		5			),
											(	'Le Huy Hung'		,		4			),
											(	'Tran VAn THuan'	,		5			),
											(	'Le Van Hung'		,		10			),
											(	'Le Minh Duc'		,		5			),
											(	'Nguyen Minh Thanh' ,		5			);
                                    
INSERT INTO			Employee_Skill_Table	(Employee_Number ,	Skill_Code	, 	Date_Registered)
VALUE										(1				 ,	1			,	'1997-2-7'		),
											(2				 ,	'Java'		,	'1994-7-7'		),
											(3				 ,	3			,	'1993-5-7'		),
											(4				 ,	4			,	'1992-1-7'		),
											(5				 ,	5			,	'1991-1-7'		),
											(6				 ,	6			,	'1998-7-7'		),
											(7				 ,	'Java'		,	'1999-7-7'		),
											(2				 ,	2			,	'1997-9-7'		),
											(3				 ,	4			,	'1994-10-7'		),
											(7				 ,	'Java'		,	'1995-11-7' 	);

-- Question 3:  Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java Hướng dẫn: sử dụng UNION
SELECT 		ET.Employee_Name
FROM		Employee_Table as ET
LEFT JOIN	Employee_Skill_Table as EST
ON			ET.Employee_Number = EST.Employee_Number
WHERE		EST.Skill_Code = 'Java';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT		D.Department_Name
FROM		Department AS D
LEFT JOIN	Employee_Table AS ET
ON			D.Department_Number = ET.Department_Number
GROUP BY	ET.Department_Number
HAVING		count(ET.Department_Number) >3;

-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban. Hướng dẫn: sử dụng GROUP BY

SELECT		D.Department_Number, D.Department_Name, ET.Employee_Name
FROM		Employee_Table AS	ET
LEFT JOIN	Department AS	D
ON			ET.Department_Number = D.Department_Number
ORDER BY	ET.Department_Number ASC;

-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills. Hướng dẫn: sử dụng DISTINCT
SELECT		D.Department_Name, ET.Employee_Name, count(EST.Employee_Number) AS SoLuongSkill
FROM		Employee_Table AS ET
JOIN		Employee_Skill_Table AS EST
JOIN		Department AS D
ON			ET.Employee_Number = EST.Employee_Number AND D.Department_Number = ET.Department_Number
GROUP BY	EST.Employee_Number
HAVING		count(EST.Employee_Number) >1;






                                  
