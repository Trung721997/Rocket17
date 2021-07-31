DROP DATABASE IF EXISTS 	Testing_System_Assignment_1 ;
CREATE DATABASE 			Testing_System_Assignment_1 ;
USE							Testing_System_Assignment_1 ;

-- Tạo bẳng Department
DROP DATABASE IF EXISTS	Department;
CREATE TABLE			Department(
DepartmentID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
DepartmentName			NVARCHAR(20) NOT NULL
);

-- Tạo bảng Position
DROP DATABASE IF EXISTS `Position`;
CREATE TABLE 			`Position`(
PositionID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
PositionName			ENUM('Dev', 'Test', 'Scrum Master', 'PM') NOT NULL
);

-- Tạo bảng Account
DROP DATABASE IF EXISTS `Account`;
CREATE TABLE 			`Account`(
AccountID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Email					NVARCHAR(50) UNIQUE NOT NULL,
Username				NVARCHAR(20) UNIQUE NOT NULL CHECK( length(Username) > 6),
FullName				NVARCHAR(20) NOT NULL,
DepartmentID			TINYINT UNSIGNED NOT NULL,
PositionID				TINYINT UNSIGNED NOT NULL,
CreateDate				DATE NOT NULL,
FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID) 
);

-- Tạo bảng Group
DROP DATABASE IF EXISTS `Group`;
CREATE TABLE 			`Group`(
GroupID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
GroupName				NVARCHAR(20) UNIQUE NOT NULL,
CreatorID				TINYINT UNSIGNED NOT NULL,
CreateDate				DATE NOT NULL
);

-- Tạo bảng GroupAccount
DROP DATABASE IF EXISTS GroupAccount;
CREATE TABLE			GroupAccount(
GroupID					TINYINT UNSIGNED NOT NULL,
AccountID				INT UNSIGNED NOT NULL,
JoinDate				DATE NOT NULL,
PRIMARY KEY	(GroupID, AccountID),
FOREIGN KEY	(GroupID) REFERENCES `Group`(GroupID),
FOREIGN KEY	(AccountID) REFERENCES `Account`(AccountID)
);

-- Tạo bảng TypeQuestion
DROP DATABASE IF EXISTS TypeQuestion;
CREATE TABLE			TypeQuestion (
TypeID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
TypeName				ENUM('Essay', 'Multiple Choice' ) NOT NULL
);

-- Tạo bảng CategoryQuestion
DROP DATABASE IF EXISTS CategoryQuestion;
CREATE TABLE			CategoryQuestion(
CategoryID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
CategoryName			ENUM('Java', '.NET', 'SQL', 'Postman', 'Ruby') NOT NULL
);

-- Tạo bảng Question
DROP DATABASE IF EXISTS Question;
CREATE TABLE			Question(
QuestionID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Content					NVARCHAR(100) UNIQUE NOT NULL,
CategoryID				TINYINT UNSIGNED NOT NULL,
TypeID					TINYINT UNSIGNED NOT NULL,
CreatorID				INT UNSIGNED NOT NULL,
CreateDate				DATE NOT NULL,
FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID),
FOREIGN KEY (CreatorID) REFERENCES	`Account` (AccountID)
);

-- Tạo bảng Answer
DROP DATABASE IF EXISTS Answer;
CREATE TABLE 			Answer(
AnswerID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Content					NVARCHAR(100) UNIQUE NOT NULL,
QuestionID				INT UNSIGNED NOT NULL,
isCorrect				ENUM ('Đúng', 'Sai') NOT NULL,
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

-- Tạo bảng Exam
DROP DATABASE IF EXISTS Exam;
CREATE TABLE			Exam(
ExamID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`Code`					TINYINT UNSIGNED UNIQUE NOT NULL,
Title					NVARCHAR(50) UNIQUE NOT NULL,
CategoryID				TINYINT UNSIGNED UNIQUE NOT NULL,
Duration				TINYINT UNSIGNED NOT NULL,
CreatorID				TINYINT UNSIGNED NOT NULL,
CreateDate				DATE NOT NULL
);

-- Tạo bảng ExamQuestion
DROP DATABASE IF EXISTS ExamQuestion;
CREATE TABLE			ExamQuestion(
ExamID					TINYINT UNSIGNED NOT NULL,
QuestionID				INT UNSIGNED NOT NULL,
FOREIGN KEY (ExamID) REFERENCES Exam(ExamID),
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

-- Thêm data vào table
INSERT INTO		Department	( DepartmentName	)
VALUE						( N'Phòng Sale'		),
							( N'Phòng marketing'),
                            ( N'Phòng Chiến Lược'),
                            ( N'Phòng Kế Toán'	),
                            ( N'Phòng Tư Vấn'	),
                            ( N'Phòng Hành Chính'),
                            ( N'Phòng Nhân Sự'	),
                            ( N'Phòng Sản Xuất'	),
                            ( N'Phòng Vận Chuyển'),
                            ( N'Phòng Kỹ Thuật'	),
                            ( N'Phòng Bảo Vệ'	),
                            ( N'Phòng Vệ Sinh'	);

INSERT INTO		`Position`	( PositionName	)
VALUE						(	'Dev'		),
							(	'Test'		),
                            ( 'Scrum Master'),
                            (	'PM'		);
                            
INSERT INTO		`Account`	(	Email						,	Username	,	FullName			,	DepartmentID	,	PositionID	,	CreateDate	)
VALUE						( N'Nguyenvantrung@gmail.com'	,	'VanTrung'	, N'NGuyen Van Trung'	, 		1			,		1		,	'2019-1-2'	),
							( N'Nguyenvancuong@gmail.com'	,	'VanCuong'	, N'Nguyen Van Cuong'	,		2			,		2		,	'2019-2-3'	),
                            ( N'Nguyenbathuc@gmail.com'		,	'Bathuc1'	, N'Nguyen Ba Thuc'		,		3			,		3		,	'2019-3-4'	),
                            ( N'Tranvanthuan@gmail.com'		,	'Vanthuan'	, N'Tran Van Thuan'		,		4			,		4		,	'2020-1-2'	),
                            ( N'Lehuyhung@gmail.com'		,	'Huyhung'	, N'Le Huy Hung'		,		3			,		1		,	'2020-2-3'	),
                            ( N'Nguyenvanbac@gmail.com'		,	'Vanbac1'	, N'Nguyen Van Bac'		,		6			,		1		,	'2020-3-4'	),
                            ( N'Tonghongson@gmail.com'		,	'Hongson'	, N'Tong Hong Son'		,		7			,		1		,	'2020-4-5'	),
                            ( N'lexuanhai@gmail.com'		,	'Xuanhai'	, N'Le Xuan Hai'		,		1			,		2		,	'2020-5-6'	),
                            ( N'NGuyenhuquynh@gmail.com'	,	'Nhuquynh'	, N'Nguyen Nhu Quynh'	,		1			,		3		,	'2020-7-8'	),
                            ( N'Dangvanleo@gmail.com'		,	'Dangleo'	, N'Dang Van Leo'		,		2			,		4		,	'2021-2-3'	);
                            
INSERT INTO		 `Group`	( GroupName	,	CreatorID	,	CreateDate	)
VALUE						( 'Group1'	,		1		,	'2019-1-2'	),
							( 'Group2'	,		2		,	'2019-3-4'	),
                            ( 'Group3'	,		3		,	'2019-6-2'	),
                            ( 'Group4'	,		4		,	'2019-1-9'	),
                            ( 'Group5'	,		1		,	'2020-1-2'	),
                            ( 'Group6'	,		5		,	'2020-2-3'	),
                            ( 'Group7'	,		6		,	'2020-3-4'	),
                            ( 'Group8'	,		7		,	'2020-4-5'	),
                            ( 'Group9'	,		2		,	'2020-6-7'	),
                            ( 'Group10'	,		10		,	'2020-8-9'	);
                            
INSERT INTO	    GroupAccount (	GroupID	,	AccountID	,	JoinDate	)
VALUE						 (		1	,		1		,	'2019-1-2'	),
							 (		2	,		1		,	'2019-3-4'	),
                             (		1	,		4		,	'2019-6-2'	),
                             (		3	,		2		,	'2019-1-9'	),
                             (		4	,		3		,	'2020-1-2'	),
                             (		5	,		5		,	'2020-2-3'	),
                             (		6	,		6		,	'2020-3-4'	),
                             (		1	,		5		,	'2020-4-5'	),
                             (		5	,		9		,	'2020-6-7'	),
                             (		7	,		10		,	'2020-8-9'	);
                             
INSERT INTO		TypeQuestion (	TypeName			)
VALUE						 (	 'Essay'			),
							 (	N'Multiple Choice'	);

INSERT INTO		CategoryQuestion (	CategoryName	)
VALUE							 (	'Java'			),
								 (	'.NET'			),
                                 (	'SQL'			),
                                 (	'Postman'		),
                                 (	'Ruby'			);
                                 
INSERT INTO		Question	(	Content									,	CategoryID	,	TypeID	,	CreatorID	,	CreateDate	)
VALUE						(	'Cau hoi aaaaaaaaaaaaaaaaaaaaaaaaaaaa'	,	1			,	1		,	1			,	'2019-1-2'	),
							(	'bbbbbbbbbbbbbbbbbbbbbbbbb'				,	2			,	1		,	2			,	'2019-3-4'	),
                            (	'ccccccccccccccccccccccccccccc'			,	3			,	2		,	3			,	'2019-6-2'	),
                            (	'ddddddddddddd'							,	1			,	1		,	1			,	'2019-1-9'	),
                            (	'eeeeeeeeeeeeeeeeeeeeeeeeeeee'			,	4			,	2		,	1			,	'2020-1-2'	),
                            (	'fffffffffffffffff'						,	5			,	1		,	4			,	'2020-2-3'	),
                            (	'gggggggggggggggggggggggggg'			,	1			,	2		,	5			,	'2020-3-4'	),
                            (	'hhhhhhhhhhhhhhhhhhhhhhhhh'				,	2			,	1		,	6			,	'2020-4-5'	),
                            (	'kkkkkkkkkkkkkkkkkkkkk'					,	1			,	1		,	7			,	'2020-6-7'	),
                            (	'oooooooooooooooooooo'					,	5			,	1		,	2			,	'2020-8-9'	);
                            
INSERT INTO		 Answer		(	Content								,	QuestionID	,	isCorrect	)
VALUE						(	'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'	,	1			,	'Đúng'		),
							(	'yyyyyyyyyyyyyyyyyyyyyy'			,	2			,	'Sai'		),
                            (	'zzzzzzzzzzzzzzzzzzzzzzzzzzz'		,	3			,	'Đúng'		),
                            (	'pppppppppppppppppppppppppppppppp'	,	4			,	'Đúng'		),
                            (	'QQQQQQQQQQQQQQQQQQQQQQQ'			,	5			,	'Sai'		),
                            (	'rrrrrrrrrrrrrrrrrrrrrrrr'			,	6			,	'Sai'		),
                            (	'tttttttttt'						,	1			,	'Sai'		),
                            (	'eeeeeeeeeeeeeeeeeeeeee'			,	1			,	'Sai'		),
                            (	'ssssssssssssssssssssssss'			,	1			,	'Sai'		),
                            (	'mmmmmmmmmmmmmmmmmmm'				,	10			,	'Đúng'		);
                            
INSERT INTO		Exam		(	`Code`	,	Title		,	CategoryID	,	Duration	,	CreatorID	,	CreateDate	)
VALUE						(	121		,	'Title1'	,	1			,	45			,	1			,	'2019-1-2'	),
							(	122		,	'Title2'	,	2			,	60			,	2			,	'2019-3-4'	),
                            (	123		,	'Title3'	,	3			,	90			,	3			,	'2019-6-2'	),
                            (	124		,	'Title4'	,	4			, 	120			,	4			,	'2019-1-9'	),
                            (	125		,	'Title5'	,	5			,	45			,	2			,	'2020-1-2'	),
                            (	126		,	'Title6'	,	6			,	60			,	2			,	'2020-2-3'	),
                            (	127		,	'Title7'	,	7			,	90			,	5			,	'2020-3-4'	),
                            (	128		,	'Title8'	,	8			,	120			,	1			,	'2020-4-5'	),
                            (	129		,	'Title9'	,	9			,	120			,	6			,	'2020-6-7'	),
                            (	131		,	'Title10'	,	10			,	45			,	7			,	'2020-8-9'	),
                            (	132		,	'Title11'	,	11			,	90			,	9			,	'2021-1-2'	),
							(	133		,	'Title12'	,  	12			,	45			,	9			,	'2021-3-4'	);
                            
INSERT INTO		ExamQuestion (	ExamID	,	QuestionID	)
VALUE						 (	1		,	1			),
							 (	2		,	2			),
                             (	3		,	3			),
                             (	4		,	1			),
                             (	1		,	2			),
                             (	5		,	1			),
							 (	5		,	6			),
							 (	10		,	9			),
                             (	8		,	9			),
                             (	1		,	9			);





-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban
DROP PROCEDURE IF EXISTS Store_phong_ban;
DELIMITER $$
CREATE PROCEDURE Store_phong_ban ( IN in_Phong_Ban VARCHAR(50) )
BEGIN
	SELECT		*
    FROM		Department as D
    JOIN		`Account` as A
    ON			D.DepartmentID = A.DepartmentID
    WHERE		D.DepartmentName = in_Phong_Ban;
END $$
DELIMITER ;
call Store_phong_ban(N'Phòng Sale'	);

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS TEN_GROUP ;
DELIMITER $$
CREATE PROCEDURE TEN_GROUP (IN  NHAP_TEN VARCHAR (20) )
BEGIN
	SELECT  count(GroupAccount.AccountID)  ,GroupName
    FROM	`Group`
	INNER  JOIN GroupAccount ON  GroupAccount.GroupID=`Group`.GroupID
    WHERE  GroupName = NHAP_TEN 
    GROUP BY    GroupAccount.GroupID;
END	$$
DELIMITER ;
CALL TEN_GROUP ('Group1');

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS TypeQuestion_co_bao_nhieu_question;
DELIMITER $$
CREATE PROCEDURE TypeQuestion_co_bao_nhieu_question ( IN in_Type_ID TINYINT )
BEGIN
	SELECT		*
    FROM		TypeQuestion as TQ
    JOIN		Question as Q
    ON			TQ.TypeID = Q.TypeID
    WHERE		Q.TypeID = in_Type_ID;
END $$
DELIMITER ;
call TypeQuestion_co_bao_nhieu_question(2);


                                   


