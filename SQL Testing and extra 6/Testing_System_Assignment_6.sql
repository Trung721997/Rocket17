DROP DATABASE IF EXISTS 	Testing_System_Assignment_1 ;
CREATE DATABASE 			Testing_System_Assignment_1 ;
USE							Testing_System_Assignment_1 ;

-- Tạo bẳng Department
DROP TABLE IF EXISTS	Department;
CREATE TABLE			Department(
DepartmentID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
DepartmentName			NVARCHAR(20) NOT NULL
);

-- Tạo bảng Position
DROP TABLE IF EXISTS `Position`;
CREATE TABLE 			`Position`(
PositionID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
PositionName			ENUM('Dev', 'Test', 'Scrum Master', 'PM') NOT NULL
);

-- Tạo bảng Account
DROP TABLE IF EXISTS `Account`;
CREATE TABLE 			`Account`(
AccountID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Email					NVARCHAR(50) UNIQUE NOT NULL,
Username				NVARCHAR(20) UNIQUE NOT NULL CHECK( length(Username) > 6),
FullName				NVARCHAR(20) NOT NULL,
DepartmentID			TINYINT UNSIGNED NOT NULL,
PositionID				TINYINT UNSIGNED NOT NULL,
CreateDate				DATE NOT NULL,
FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID) ON DELETE CASCADE,
FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID) ON DELETE CASCADE
);

-- Tạo bảng Group
DROP TABLE IF EXISTS `Group`;
CREATE TABLE 			`Group`(
GroupID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
GroupName				NVARCHAR(20) UNIQUE NOT NULL,
CreatorID				TINYINT UNSIGNED NOT NULL,
CreateDate				DATE NOT NULL
);

-- Tạo bảng GroupAccount
DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE			GroupAccount(
GroupID					TINYINT UNSIGNED NOT NULL,
AccountID				INT UNSIGNED NOT NULL,
JoinDate				DATE NOT NULL,
PRIMARY KEY	(GroupID, AccountID),
FOREIGN KEY	(GroupID) REFERENCES `Group`(GroupID) ON DELETE CASCADE,
FOREIGN KEY	(AccountID) REFERENCES `Account`(AccountID) ON DELETE CASCADE
);

-- Tạo bảng TypeQuestion
DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE			TypeQuestion (
TypeID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
TypeName				ENUM('Essay', 'Multiple Choice' ) NOT NULL
);

-- Tạo bảng CategoryQuestion
DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE			CategoryQuestion(
CategoryID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
CategoryName			ENUM('Java', '.NET', 'SQL', 'Postman', 'Ruby') NOT NULL
);

-- Tạo bảng Question
DROP TABLE IF EXISTS Question;
CREATE TABLE			Question(
QuestionID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Content					NVARCHAR(100) UNIQUE NOT NULL,
CategoryID				TINYINT UNSIGNED NOT NULL,
TypeID					TINYINT UNSIGNED NOT NULL,
CreatorID				INT UNSIGNED NOT NULL,
CreateDate				DATE NOT NULL,
FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID) ON DELETE CASCADE,
FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID) ON DELETE CASCADE,
FOREIGN KEY (CreatorID) REFERENCES	`Account` (AccountID) ON DELETE CASCADE
);

-- Tạo bảng Answer
DROP TABLE IF EXISTS Answer;
CREATE TABLE 			Answer(
AnswerID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Content					NVARCHAR(100) UNIQUE NOT NULL,
QuestionID				INT UNSIGNED NOT NULL,
isCorrect				ENUM ('Đúng', 'Sai') NOT NULL,
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID) ON DELETE CASCADE
);

-- Tạo bảng Exam
DROP TABLE IF EXISTS Exam;
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
DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE			ExamQuestion(
ExamID					TINYINT UNSIGNED NOT NULL,
QuestionID				INT UNSIGNED NOT NULL,
FOREIGN KEY (ExamID) REFERENCES Exam(ExamID) ON DELETE CASCADE,
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID) ON DELETE CASCADE
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
                            ( N'Nguyenbathuc@gmail.com'		,	'Bathuc1'	, N'Nguyen Ba Thuc'		,		1			,		3		,	'2019-3-4'	),
                            ( N'Tranvanthuan@gmail.com'		,	'Vanthuan'	, N'Tran Van Thuan'		,		4			,		4		,	'2020-1-2'	),
                            ( N'Lehuyhung@gmail.com'		,	'Huyhung'	, N'Le Huy Hung'		,		3			,		1		,	'2020-2-3'	),
                            ( N'Nguyenvanbac@gmail.com'		,	'Vanbac1'	, N'Nguyen Van Bac'		,		6			,		1		,	'2020-3-4'	),
                            ( N'Tonghongson@gmail.com'		,	'Hongson'	, N'Tong Hong Son'		,		7			,		1		,	'2020-4-5'	),
                            ( N'lexuanhai@gmail.com'		,	'Xuanhai'	, N'Le Xuan Hai'		,		1			,		2		,	'2020-5-6'	),
                            ( N'NGuyenhuquynh@gmail.com'	,	'Nhuquynh'	, N'Nguyen Nhu Quynh'	,		3			,		3		,	'2020-7-8'	),
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
                             (		5	,		1		,	'2020-2-3'	),
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
                            (	'ccccccccccccccccccccccccccccc'			,	3			,	2		,	3			,	'2019-8-2'	),
                            (	'ddddddddddddd'							,	1			,	1		,	1			,	'2019-1-9'	),
                            (	'eeeeeeeeeeeeeeeeeeeeeeeeeeee'			,	4			,	2		,	1			,	'2020-8-2'	),
                            (	'fffffffffffffffff'						,	5			,	1		,	4			,	'2020-2-3'	),
                            (	'gggggggggggggggggggggggggg'			,	1			,	2		,	5			,	'2020-3-4'	),
                            (	'hhhhhhhhhhhhhhhhhhhhhhhhh'				,	2			,	1		,	6			,	'2020-4-5'	),
                            (	'kkkkkkkkkkkkkkkkkkkkk'					,	1			,	1		,	7			,	'2020-6-7'	),
                            (	'oooooooooooooooooooo'					,	5			,	1		,	2			,	'2021-8-9'	);
                            
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
	SELECT		A.Email, A.Username, A.FullName
    FROM		Department	 AS D
    JOIN		`Account`	 AS A
    ON			D.DepartmentID = A.DepartmentID
    WHERE		D.DepartmentName = in_Phong_Ban;
END $$
DELIMITER ;
call Store_phong_ban(N'Phòng Sale');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS TEN_GROUP ;
DELIMITER $$
CREATE PROCEDURE TEN_GROUP (IN  Nhap_Ten_Group VARCHAR (20), OUT Ket_Qua VARCHAR(50), OUT So_Luong TINYINT)
BEGIN
	SELECT  	A.Email, count(GA.GroupID) INTO Ket_Qua, So_Luong
    FROM		GroupAccount	AS	GA
	JOIN 		`Group`			AS	G		ON 	GA.GroupID = G.GroupID
	JOIN		`Account`	 	AS	A		ON	GA.AccountID = A.AccountID
    WHERE		G.GroupName =	Nhap_Ten_Group
    GROUP BY	GA.GroupID;
END	$$
DELIMITER ;
CALL 			TEN_GROUP ('Group5', @Ket_Qua, @So_Luong);
SELECT			@Ket_Qua, @So_Luong;
-- Question 3: Tạo store để thống kê mỗi typequestion có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS TypeQuestion_co_bao_nhieu_question;
DELIMITER $$
CREATE PROCEDURE TypeQuestion_co_bao_nhieu_question ( IN Type_ID TINYINT)
BEGIN
	SELECT		Q.QuestionID, Q.Content, Q.CreateDate
    FROM		TypeQuestion 	AS TQ
    JOIN		Question 		AS Q
    ON			TQ.TypeID = Q.TypeID
    WHERE		Q.TypeID = Type_ID	AND	MONTH(CreateDate) = MONTH(now());
END $$
DELIMITER ;
CALL 			TypeQuestion_co_bao_nhieu_question(2);

-- Question 3: ------------------------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS TypeQuestion_co_bao_nhieu_question;
DELIMITER $$
CREATE PROCEDURE TypeQuestion_co_bao_nhieu_question ( IN Type_ID TINYINT, OUT Ket_Qua_ID INT, OUT Ket_Qua_Content VARCHAR(100), OUT Ket_Qua_Thang DATE)
BEGIN
	SELECT		Q.QuestionID, Q.Content, Q.CreateDate INTO Ket_Qua_ID,  Ket_Qua_Content, Ket_Qua_Thang
    FROM		TypeQuestion 	AS TQ
    JOIN		Question 		AS Q
    ON			TQ.TypeID = Q.TypeID
    WHERE		Q.TypeID = Type_ID	AND	MONTH(CreateDate) = MONTH(now())
    LIMIT		1;
END $$
DELIMITER ;
CALL 			TypeQuestion_co_bao_nhieu_question(2, @Ket_Qua_ID, @Ket_Qua_Content, @Ket_Qua_Thang);
SELECT			@Ket_Qua_ID, @Ket_Qua_Content, @Ket_Qua_Thang;

-- Question 4: Tạo store để trả ra id của typequestion có nhiều câu hỏi nhất
-- Cach 1
DROP VIEW IF EXISTS	Max_SoLuong;
CREATE VIEW		Max_SoLuong	AS
				SELECT		count(Q.TypeID) AS KQ
				FROM		Question 	AS Q
                GROUP BY	Q.TypeID ;           
DROP PROCEDURE IF EXISTS		Ket_Qua_Question_NN;
DElIMITER $$
CREATE PROCEDURE	Ket_Qua_Question_NN (OUT ID TINYINT)
	BEGIN
		SELECT		TQ.TypeID INTO ID
		FROM		TypeQuestion 	AS TQ
		JOIN		Question 		AS Q
		ON			TQ.TypeID	=	Q.TypeID
		GROUP BY	Q.TypeID
		HAVING		count(Q.TypeID) IN (SELECT		max(KQ)
										FROM		Max_SoLuong);                      
	END $$
DELIMITER ;
Call			Ket_Qua_Question_NN(@ID);
SELECT			@ID;


-- Cach 2
DROP PROCEDURE IF EXISTS		Ket_Qua_Question_NN;
DElIMITER $$
CREATE PROCEDURE	Ket_Qua_Question_NN (OUT ID TINYINT)
	BEGIN
		WITH	Max_SoLuong	AS (
								SELECT		count(Q.TypeID) AS KQ
								FROM		Question 	AS Q
								GROUP BY	Q.TypeID )        
		SELECT		TQ.TypeID INTO ID
		FROM		TypeQuestion 	AS TQ
		JOIN		Question 		AS Q
		ON			TQ.TypeID	=	Q.TypeID
		GROUP BY	Q.TypeID
		HAVING		count(Q.TypeID) IN (SELECT		max(KQ)
										FROM		Max_SoLuong);                     
	END $$
DELIMITER ;
Call			Ket_Qua_Question_NN(@ID);
SELECT			@ID;

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP VIEW IF EXISTS	Max_SoLuong;
CREATE VIEW		Max_SoLuong	AS
				SELECT		count(Q.TypeID) AS KQ
				FROM		Question 	AS Q
                GROUP BY	Q.TypeID ;           
DROP PROCEDURE IF EXISTS		Ket_Qua_Question_NN;
DElIMITER $$
CREATE PROCEDURE	Ket_Qua_Question_NN (OUT ID TINYINT)
	BEGIN
		SELECT		TQ.TypeID INTO ID
		FROM		TypeQuestion 	AS TQ
		JOIN		Question 		AS Q
		ON			TQ.TypeID	=	Q.TypeID
		GROUP BY	Q.TypeID
		HAVING		count(Q.TypeID) IN (SELECT		max(KQ)
										FROM		Max_SoLuong);                      
	END $$
DELIMITER ;
Call			Ket_Qua_Question_NN(@ID);
SELECT			TypeName
FROM			TypeQuestion
WHERE			TypeID = @ID;

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS Ket_Qua_Nhap_Vao;
DElIMITER $$
CREATE PROCEDURE	Ket_Qua_Nhap_Vao (IN  NhapChuoiKyTu VARCHAR(20))
	BEGIN
		SELECT		GroupName
		FROM		`Group`
		WHERE		GroupName LIKE  CONCAT("%",NhapChuoiKyTu,"%")
        UNION
        SELECT 		Username 
        FROM 		`account` 
        WHERE 		Username LIKE CONCAT("%",NhapChuoiKyTu,"%");
	END $$
DELIMITER ;
CALL				Ket_Qua_Nhap_Vao(1);

-- Question 7:----------------------------------------------------------------------------------
/* Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:
username sẽ giống email nhưng bỏ phần @..mail đi
positionID: sẽ có default là developer
departmentID: sẽ được cho vào 1 phòng chờ
 Sau đó in ra kết quả tạo thành công */

DROP PROCEDURE IF EXISTS table_moi;
DElIMITER $$
CREATE PROCEDURE	table_moi (IN fullname VARCHAR(20), IN	email VARCHAR(50) )
	BEGIN	
		DECLARE		fullname VARCHAR(20);
        DECLARE		email VARCHAR(50);
		DECLARE		username   VARCHAR(20) DEFAULT substring_index(Email,'@',1);
        DECLARE		positionid TINYINT UNSIGNED DEFAULT 11;
        DECLARE		departmentid TINYINT UNSIGNED DEFAULT 1;
        DECLARE		CreateDate DATE	DEFAULT now();
        INSERT INTO		`Account`	(	`Email`	,	`Username`	,	`FullName`	,	`DepartmentID`	,	`PositionID`	,	`CreateDate`)
		VALUES						( 	 email	,	username	, 	fullname	, 	departmentid	,	positionid		,	CreateDate	);
	END $$
DELIMITER ;
CALL				table_moi('abcdefgd', 'abdsadasdsa@gmail.com');
SELECT	*
FROM	`Account`;

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất                                
DROP PROCEDURE IF EXISTS Ket_Qua_Nhap_Vao1;
DElIMITER $$
CREATE PROCEDURE	Ket_Qua_Nhap_Vao1 (IN  Nhap_Essay_Or_MultipleChoice	VARCHAR(50))
	BEGIN
		SELECT		Content, max(length(Content))
		FROM		Question		AS	Q
        JOIN		TypeQuestion	AS	TQ
        ON			Q.TypeID	=	TQ.TypeID
		WHERE		TQ.TypeName	= Nhap_Essay_Or_MultipleChoice;
	END $$
DELIMITER ;
CALL				Ket_Qua_Nhap_Vao1(N'Multiple Choice');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS	Xoa_Exam;
DElIMITER $$
CREATE PROCEDURE	Xoa_Exam (IN Nhap_ID TINYINT)
	BEGIN
		DELETE
		FROM		Exam
		WHERE		ExamID = Nhap_ID;
	END $$
DELIMITER ;
CALL				Xoa_Exam(1);

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi sử dụng store ở câu 9 để xóa Sau đó in số lượng record đã remove từ các table liên quan trong khi removing
DROP PROCEDURE IF EXISTS	Xoa_Exam;
DElIMITER $$
CREATE PROCEDURE	Xoa_Exam (IN Nhap_ID TINYINT)
	BEGIN
		DELETE
		FROM		Exam
		WHERE		(YEAR(now()) - YEAR(CreateDate)) > 1;
        
        SELECT		count(ExamID)
		FROM		Exam
		WHERE		(year(now()) - year(CreateDate)) > 1;
	END $$
DELIMITER ;
CALL				Xoa_Exam(1);

-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc
DROP PROCEDURE IF EXISTS	question11;
DELIMITER $$
CREATE PROCEDURE 	question11 (IN Nhap_ID_Phong_Ban TINYINT UNSIGNED)
	BEGIN
		DECLARE		Q_DepartmentID TINYINT UNSIGNED	DEFAULT 11;
        
		DELETE
		FROM		Department
        WHERE		DepartmentID = Nhap_ID_Phong_Ban;
        
        UPDATE		`Account`
        SET			DepartmentID = Q_DepartmentID
        WHERE		DepartmentID = Nhap_ID_Phong_Ban;

	END $$
DELIMITER ;
CALL				question11(1);

-- Question 12:Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay
DROP PROCEDURE IF EXISTS	question12;
DELIMITER $$
CREATE PROCEDURE 	question12 (IN Nhap_Thang TINYINT UNSIGNED)
	BEGIN
			SELECT		Content, year(CreateDate), month(CreateDate)
            FROM		Question
            WHERE		year(CreateDate) = year(now()) AND	month(CreateDate) = Nhap_Thang;

	END $$
DELIMITER ;
CALL				question12(8);

-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
--              (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")

DROP PROCEDURE IF EXISTS	question13;
DELIMITER $$
CREATE PROCEDURE 	question13 (IN Nhap_Nam DATE)
	BEGIN
			SELECT		Content, year(CreateDate), month(CreateDate)
            FROM		Question
            WHERE		year(CreateDate) = Nhap_Nam AND (month(now()) - month(CreateDate)) < 6;

	END $$
DELIMITER ;
CALL				question13('2021');


































