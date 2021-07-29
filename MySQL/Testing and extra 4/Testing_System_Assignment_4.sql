DROP DATABASE IF EXISTS 	Testing_System_Assignment_1 ;
CREATE DATABASE 			Testing_System_Assignment_1 ;
USE							Testing_System_Assignment_1 ;

-- Tạo bẳng Department
DROP DATABASE IF EXISTS	Department;
CREATE TABLE	Department(
DepartmentID	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
DepartmentName	VARCHAR(20) UNIQUE NOT NULL
);

-- Tạo bảng Position
DROP DATABASE IF EXISTS 	`Position`;
CREATE TABLE 	`Position`(
PositionID		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
PositionName	ENUM('Dev', 'Test', 'Scrum Master', 'PM') UNIQUE NOT NULL
);

-- Tạo bảng Account
DROP DATABASE IF EXISTS `Account`;
CREATE TABLE 	`Account`(
AccountID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Email			VARCHAR(50) UNIQUE NOT NULL,
Username		VARCHAR(20) UNIQUE NOT NULL CHECK( length(Username) > 6),
FullName		VARCHAR(20) NOT NULL,
DepartmentID	TINYINT UNSIGNED NOT NULL,
PositionID		TINYINT UNSIGNED NOT NULL,
CreateDate		DATE NOT NULL,
FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID) 
);

-- Tạo bảng Group
DROP DATABASE IF EXISTS `Group`;
CREATE TABLE 	`Group`(
GroupID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
GroupName		VARCHAR(20) UNIQUE NOT NULL,
CreatorID		TINYINT UNSIGNED NOT NULL,
CreateDate		DATE NOT NULL
);

-- Tạo bảng GroupAccount
DROP DATABASE IF EXISTS GroupAccount;
CREATE TABLE	GroupAccount(
GroupID			TINYINT UNSIGNED NOT NULL,
AccountID		INT UNSIGNED NOT NULL,
JoinDate		DATE NOT NULL,
FOREIGN KEY	(GroupID) REFERENCES `Group`(GroupID),
FOREIGN KEY	(AccountID) REFERENCES `Account`(AccountID)
);

-- Tạo bảng TypeQuestion
DROP DATABASE IF EXISTS TypeQuestion;
CREATE TABLE	TypeQuestion (
TypeID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
TypeName		ENUM('Essay', 'Multiple Choice' ) UNIQUE NOT NULL
);

-- Tạo bảng CategoryQuestion
DROP DATABASE IF EXISTS CategoryQuestion;
CREATE TABLE	CategoryQuestion(
CategoryID		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
CategoryName	ENUM('Java', '.NET', 'SQL', 'Postman', 'Ruby') UNIQUE NOT NULL
);

-- Tạo bảng Question
DROP DATABASE IF EXISTS Question;
CREATE TABLE	Question(
QuestionID		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Content			VARCHAR(100) UNIQUE NOT NULL,
CategoryID		TINYINT UNSIGNED NOT NULL,
TypeID			TINYINT UNSIGNED NOT NULL,
CreatorID		INT UNSIGNED NOT NULL,
CreateDate		DATE NOT NULL,
FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID),
FOREIGN KEY (CreatorID) REFERENCES	`Account` (AccountID)
);

-- Tạo bảng Answer
DROP DATABASE IF EXISTS Answer;
CREATE TABLE 	Answer(
AnswerID		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Content			VARCHAR(100) UNIQUE NOT NULL,
QuestionID		TINYINT UNSIGNED NOT NULL,
isCorrect		ENUM ('Đúng', 'Sai') NOT NULL,
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

-- Tạo bảng Exam
DROP DATABASE IF EXISTS Exam;
CREATE TABLE	Exam(
ExamID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`Code`			TINYINT UNSIGNED UNIQUE NOT NULL,
Title			VARCHAR(50) UNIQUE NOT NULL,
CategoryID		TINYINT UNSIGNED UNIQUE NOT NULL,
Duration		TINYINT UNSIGNED NOT NULL,
CreatorID		TINYINT UNSIGNED NOT NULL,
CreateDate		DATE NOT NULL
);

-- Tạo bảng ExamQuestion
DROP DATABASE IF EXISTS ExamQuestion;
CREATE TABLE	ExamQuestion(
ExamID			TINYINT UNSIGNED NOT NULL,
QuestionID		TINYINT UNSIGNED NOT NULL,
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
                             
                             
                             
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT		*
FROM		Department as D
JOIN		`Account` as A
ON			D.DepartmentID = A.DepartmentID;

 -- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 
 SELECT		*
 FROM		`Account`
 WHERE		CreateDate > '2010-12-20';
 
 -- Question 3: Viết lệnh để lấy ra tất cả các developer
 SELECT		*
 FROM		Position as P
 JOIN		`Account` as A
 ON			P.PositionID = A.PositionID
 WHERE		P.PositionName = 'Dev';
 
 -- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >=3 nhân viên
 SELECT		D.DepartmentID, D.DepartmentName, count(D.DepartmentID) as Dem
 FROM		Department as D
 JOIN		`Account` as A
 ON			D.DepartmentID = A.DepartmentID
GROUP BY	D.DepartmentID
HAVING		count(D.DepartmentID) >= 3;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT		*, count(EQ.QuestionID) as Dem
FROM		Question as Q
JOIN		ExamQuestion as EQ
ON			Q.QuestionID = EQ.QuestionID
GROUP BY	EQ.QuestionID 
HAVING		count(EQ.QuestionID) = (SELECT 		max(A)
									 FROM		(SELECT		count(EQ.QuestionID) as A
												FROM		Question as Q
                                                JOIN		ExamQuestion as EQ
                                                ON			Q.QuestionID = EQ.QuestionID
                                                GROUP BY	EQ.QuestionID )	as B);
                                                
-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT		CQ.CategoryID, CQ.CategoryName, count(Q.CategoryID) as Dem
FROM		CategoryQuestion as CQ
JOIN		Question as Q
ON			CQ.CategoryID = Q.CategoryID
GROUP BY	Q.CategoryID
HAVING		count(Q.CategoryID);

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT		Q.QuestionID, Q.Content, count(Q.QuestionID) as Dem
FROM		Question as Q
JOIN		ExamQuestion as EQ
ON			Q.QuestionID = EQ.QuestionID
GROUP BY	EQ.QuestionID
HAVING		count(Q.QuestionID);

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
SELECT		 *, count(AR.QuestionID) as Dem
FROM		Question as Q
JOIN		Answer as AR
ON			Q.QuestionID = AR.QuestionID
GROUP BY	AR.QuestionID
HAVING		count(AR.QuestionID) = (SELECT		max(A)
									FROM		(SELECT 	count(AR.QuestionID) as A
												FROM		Question as Q
                                                JOIN		Answer as AR
												ON			Q.QuestionID = AR.QuestionID
												GROUP BY	AR.QuestionID) as B);
 
 -- Question 9: Thống kê số lượng account trong mỗi group
 SELECT		G.GroupID, G.GroupName, count(GA.GroupID) as Dem
 FROM		`Group` as G
 JOIN		GroupAccount as GA
 ON			G.GroupID = GA.GroupID
 GROUP BY	GA.GroupID;
 
 -- Question 10: Tìm chức vụ có ít người nhất
 SELECT		*, count(A.PositionID) as Dem
 FROM		Position as P
 JOIN		`Account` as A
 ON			P.PositionID = A.PositionID
 GROUP BY	A.PositionID
 HAVING		count(A.PositionID) = (SELECT	min(X)
								   FROM		(SELECT		count(A.PositionID) as X
											 FROM		Position as P
											 JOIN		`Account` as A
											 ON			P.PositionID = A.PositionID
											 GROUP BY	A.PositionID) as Y);
 
-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT		D.DepartmentID, D.DepartmentID, count(A.DepartmentID) as Dem
FROM		Department as D
JOIN		`Account` as A
ON			D.DepartmentID = A.DepartmentID
GROUP BY	A.DepartmentID;

-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
 SELECT		*
 FROM		Question as Q
 JOIN		TypeQuestion as T
 JOIN		Answer as AR
 ON			Q.QuestionID = AR.QuestionID AND
			Q.TypeID = T.TypeID;
            
-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT		isCorrect , count(isCorrect) as Dem
FROM		Answer
GROUP BY	isCorrect
HAVING		count(isCorrect);

-- Question 14:Lấy ra group không có account nào
SELECT		*
FROM		`Group` as G
LEFT JOIN	GroupAccount as GA
ON			G.GroupID = GA.GroupID
WHERE		GA.GroupID IS NULL;

-- Question 16: Lấy ra question không có answer nào
SELECT		*
FROM		Question as Q
LEFT JOIN	Answer as AR
ON			Q.QuestionID = AR.QuestionID
WHERE		AR.QuestionID IS NULL;

-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
SELECT		*
FROM		`Account` AS A
LEFT JOIN	GroupAccount AS GA
ON			A.AccountID = GA.AccountID
WHERE		GA.GroupID = 1;

-- b) Lấy các account thuộc nhóm thứ 2
SELECT		*
FROM		`Account` AS A
LEFT JOIN	GroupAccount AS GA
ON			A.AccountID = GA.AccountID
WHERE		GA.GroupID = 2;

-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
SELECT		*
FROM		`Account` AS A
LEFT JOIN	GroupAccount AS GA
ON			A.AccountID = GA.AccountID
WHERE		GA.GroupID = 1
UNION ALL
SELECT		*
FROM		`Account` AS A
LEFT JOIN	GroupAccount AS GA
ON			A.AccountID = GA.AccountID
WHERE		GA.GroupID = 2;

-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên
SELECT		G.GroupID, G.GroupName, count(GA.AccountID) AS Dem
FROM		`Group` AS 	G
LEFT JOIN	GroupAccount AS GA
ON			G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING		count(GA.AccountID) > 2;

-- b) Lấy các group có nhỏ hơn 1 thành viên
SELECT		G.GroupID, G.GroupName, count(GA.AccountID) AS Dem
FROM		`Group` AS 	G
LEFT JOIN	GroupAccount AS GA
ON			G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING		count(GA.AccountID) < 1;

-- c) Ghép 2 kết quả từ câu a) và câu b)
SELECT		G.GroupID, G.GroupName, count(GA.AccountID) AS Dem
FROM		`Group` AS 	G
LEFT JOIN	GroupAccount AS GA
ON			G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING		count(GA.AccountID) > 2
UNION ALL
SELECT		G.GroupID, G.GroupName, count(GA.AccountID) AS Dem
FROM		`Group` AS 	G
LEFT JOIN	GroupAccount AS GA
ON			G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING		count(GA.AccountID) < 1;
