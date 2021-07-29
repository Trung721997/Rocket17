DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE 		Fresher;
USE						Fresher;
-- Question1: CREATE TABLE Trainee
DROP DATABASE IF EXISTS Trainee;
CREATE TABLE 			Trainee(
TranineeID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
FullName				VARCHAR(30) NOT NULL,
BirthDate				DATE NOT NULL,
Gender					ENUM('male', 'female', 'unknown') NOT NULL,
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

-- Question1:
-- Thêm data vào table
INSERT INTO 			Trainee (	FullName		,	BirthDate	,	Gender		,	Et_iq	,	Et_gmath	,	Et_enghlish	,	Training_Class	,	Evaluation_Notes	, VTI_Account	)
VALUE							('Nguyen Van Trung' ,	'1997-2-7'	,	'male'		,	19		,	20			,	30			,	1				, 	'HocGioi'			,		1		),
								('Nguyen Van Cuong' ,	'1994-7-7'	,	'male'		,	18		,	19			,	31			,	2				, 	'HocGioi'			,		2		),
                                ('Nguyen Van Minh'	,	'1993-5-7'	,	'female'	,	17		,	18			,	2			,	2				, 	'HocKha'			,		3		),
                                ('Nguyen Ba THuc'	,	'1992-1-7'	,	'female'	,	16		,	17			,	33			,	3				, 	'TrungBinh'			,		4		),
                                ('Nguyen Van Bac'	,	'1991-1-7'	,	'female'	,	15		,	16			,	34			,	4				, 	'HocDot'			,		5		),
                                ('Le Huy Hung'		,	'1998-7-7'	,	'unknown'	,	14		,	15			,	35			,	5				, 	'HocGioi'			,		6		),
                                ('Tran VAn THuan'	,	'1999-7-7'	,	'male'		,	9		,	9			,	36			,	6				, 	'HocGioi'			,		7		),
                                ('Le Van Hung'		,	'1997-9-7'	,	'unknown'	,	0		,	13			,	37			,	3				, 	'HocKha'			,		8		),
                                ('Le Minh Duc'		,	'1994-10-7'	,	'male'		,	1		,	2			,	8			,	5				, 	'TrungBinh'			,		9		),
                                ('Nguyen Minh Thanh',	'1995-11-7'	,	'unknown'	,	0		,	11			,	39			,	1				, 	'TrungBinh'			,		10		);


-- Question 2:Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,nhóm chúng thành các tháng sinh khác nhau.
SELECT 		BirthDate, month(BirthDate)
FROM 		Trainee
WHERE		(Et_iq + Et_gmath) >= 20 AND Et_iq >=8 AND Et_gmath >= 8 AND Et_enghlish >= 18
GROUP BY	month(BirthDate);

-- Question 3:
SELECT		*
FROM		Trainee
WHERE		length(FullName) = (SELECT		max(length(FullName))
								FROM		Trainee
								WHERE		length(FullName));

-- Question 4:
SELECT 		*
FROM 		Trainee
WHERE		(Et_iq + Et_gmath) >= 20 AND Et_iq >=8 AND Et_gmath >= 8 AND Et_enghlish >= 18;

-- Question 5: Xóa thực tập sinh có TraineeID = 3
DELETE
FROM		Trainee
WHERE		TranineeID = 3;

-- Question 6:Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật thông tin vào database.
UPDATE		Trainee
SET			Training_Class = 2
WHERE		TranineeID = 5;


								
