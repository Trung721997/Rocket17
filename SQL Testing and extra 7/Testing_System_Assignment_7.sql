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
FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID)
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
FOREIGN KEY	(GroupID) REFERENCES `Group`(GroupID),
FOREIGN KEY	(AccountID) REFERENCES `Account`(AccountID)
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
FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID),
FOREIGN KEY (CreatorID) REFERENCES	`Account` (AccountID)
);

-- Tạo bảng Answer
DROP TABLE IF EXISTS Answer;
CREATE TABLE 			Answer(
AnswerID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Content					NVARCHAR(100) UNIQUE NOT NULL,
QuestionID				INT UNSIGNED NOT NULL,
isCorrect				ENUM ('Đúng', 'Sai') NOT NULL,
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
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
VALUE						( N'admin@gmail.com'			,	'VanTrung'	, N'NGuyen Van Trung'	, 		1			,		1		,	'2019-1-2'	),
							( N'Nguyenvancuong@gmail.com'	,	'VanCuong'	, N'Nguyen Van Cuong'	,		2			,		2		,	'2019-2-3'	),
                            ( N'Nguyenbathuc@gmail.com'		,	'Bathuc1'	, N'Nguyen Ba Thuc'		,		1			,		3		,	'2019-3-4'	),
                            ( N'Tranvanthuan@gmail.com'		,	'Vanthuan'	, N'Tran Van Thuan'		,		4			,		4		,	'2020-1-2'	),
                            ( N'Lehuyhung@gmail.com'		,	'Huyhung'	, N'Le Huy Hung'		,		3			,		1		,	'2020-2-3'	),
                            ( N'Nguyenvanbac@gmail.com'		,	'Vanbac1'	, N'Nguyen Van Bac'		,		6			,		1		,	'2020-3-4'	),
                            ( N'Tonghongson@gmail.com'		,	'Hongson'	, N'Tong Hong Son'		,		7			,		1		,	'2020-4-5'	),
                            ( N'lexuanhai@gmail.com'		,	'Xuanhai'	, N'Le Xuan Hai'		,		1			,		2		,	'2020-5-6'	),
                            ( N'NGuyenhuquynh@gmail.com'	,	'Nhuquynh'	, N'Nguyen Nhu Quynh'	,		3			,		3		,	'2020-7-8'	),
                            ( N'Dangvanleo@gmail.com'		,	'Dangleo'	, N'Dang Van Leo'		,		2			,		4		,	'2050-2-3'	);
                            
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


-- question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước
DROP TRIGGER IF EXISTS question1;
DELIMITER $$
CREATE TRIGGER question1
BEFORE INSERT ON `Group`
FOR EACH ROW
	BEGIN 
			IF NEW.CreateDate < (NOW()-  INTERVAL 1 YEAR) THEN
            SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Không cho phép người dùng nhập vòa';
            END IF;
    END $$
DELIMITER ;
INSERT INTO		 `Group`	( GroupName	,	CreatorID	,	CreateDate	)
VALUE						( 'Group1'	,		1		,	'2019-1-2'	),
							( 'Group2'	,		2		,	'2017-3-4'	);
                            
-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào  department "Sale" nữa, khi thêm thì hiện ra thông báo "Department "Sale" cannot add more user"
DROP TRIGGER IF EXISTS question2;
DELIMITER $$
CREATE TRIGGER question2
BEFORE INSERT ON `Account`
FOR EACH ROW
	BEGIN 
			IF (NEW.DepartmentID = 1)  THEN
            SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Department "Sale" cannot add more use';
            END IF;
    END $$
DELIMITER ;
INSERT INTO		`Account`	(	Email						,	Username	,	FullName			,	DepartmentID	,	PositionID	,	CreateDate	)
VALUE						( N'Nguyenvantrung@gmail.com'	,	'VanTrung'	, N'NGuyen Van Trung'	, 		1			,		1		,	'2019-1-2'	);

-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user
DROP TRIGGER IF EXISTS question3;
DELIMITER $$
CREATE TRIGGER question3
BEFORE INSERT ON GroupAccount
FOR EACH ROW
	BEGIN 
			DECLARE		So_Luong_GroupID TINYINT UNSIGNED;
			SELECT		count(GroupID) INTO	So_Luong_GroupID
            FROM		GroupAccount
            WHERE		GroupID = NEW.GroupID;
            
			IF (So_Luong_GroupID > 5) THEN
            SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Không thể đăng nhập quá 5 user';
            END IF;
    END $$
DELIMITER ;
INSERT INTO	    GroupAccount (	GroupID	,	AccountID	,	JoinDate	)
VALUE						 (		1	,		1		,	'2019-1-2'	),
							 (		1	,		2		,	'2019-3-4'	),
                             (		1	,		3		,	'2019-6-2'	),
                             (		1	,		4		,	'2019-1-9'	),
                             (		1	,		5		,	'2020-1-2'	),
                             (		1	,		6		,	'2020-1-2'	);
                             
-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question
DROP TRIGGER IF EXISTS question4;
DELIMITER $$
CREATE TRIGGER question4
BEFORE INSERT ON ExamQuestion
FOR EACH ROW
	BEGIN 
			DECLARE		So_Luong_Question TINYINT UNSIGNED;
			SELECT		count(QuestionID) INTO	So_Luong_Question
            FROM		ExamQuestion
            WHERE		QuestionID = NEW.QuestionID;
            
			IF (So_Luong_Question > 10) THEN
            SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Không thể đăng nhập quá 10 user';
            END IF;
    END $$
DELIMITER ;
INSERT INTO		ExamQuestion (	ExamID	,	QuestionID	)
VALUE						 (	1		,	1			),
							 (	1		,	2			),
                             (	1		,	3			),
                             (	1		,	4			),
                             (	1		,	5			),
                             (	1		,	6			),
							 (	1		,	7			),
							 (	1		,	8			),
                             (	1		,	9			),
                             (	1		,	10			);
                             
/* Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là 
 admin@gmail.com (đây là tài khoản admin, không cho phép user xóa), 
 còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông 
 tin liên quan tới user đó */
DROP TRIGGER IF EXISTS question5;
DELIMITER $$
CREATE TRIGGER question5
BEFORE DELETE ON `Account`
FOR EACH ROW
	BEGIN 
            IF OLD.Email = 'admin@gmail.com' THEN
            SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Không thể delete admin';
            END IF;
    END $$
DELIMITER ;
DELETE		
FROM		`Account`
WHERE		Email = 'admin@gmail.com';

/* Question 6: Không sử dụng cấu hình default cho field DepartmentID của table 
 Account, hãy tạo trigger cho phép người dùng khi tạo account không điền 
 vào departmentID thì sẽ được phân vào phòng ban "waiting Department" */
DROP TRIGGER IF EXISTS question6;
DELIMITER $$
CREATE TRIGGER question6
BEFORE INSERT ON `Account`
FOR EACH ROW
	BEGIN 
			DECLARE Nhap_DepartmentName	VARCHAR(20);
            IF	(NEW.DepartmentID IS NULL)	THEN
            SET	NEW.DepartmentName = Nhap_DepartmentName;
            END IF;
    END $$
DELIMITER;

-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗiquestion, trong đó có tối đa 2 đáp án đúng.
DROP TRIGGER IF EXISTS 	Question7;
DELIMITER $$
CREATE TRIGGER 			Question7
BEFORE INSERT ON Answer
FOR EACH ROW
	BEGIN
		DECLARE 	CountAnsInQUes TINYINT;
		DECLARE 	CountAnsIsCorrects TINYINT;
        
		SELECT 		count(QuestionID) INTO CountAnsInQUes
        FROM 		Answer 
        WHERE		QuestionID = NEW.QuestionID;
        
		SELECT		count(1) INTO CountAnsIsCorrects 
        FROM 		Answer
        WHERE 		QuestionID = NEW.QuestionID AND isCorrect = NEW.isCorrect;
		
		IF (CountAnsInQUes > 4 ) OR (CountAnsIsCorrects >2) THEN
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Cant insert more data pls check again!!';
		END IF;
	END $$
DELIMITER ;
INSERT INTO 		Answer 	(Content, QuestionID, isCorrect)
 VALUES						('1'	, 	253		, 1			);

/* Question 8: Viết trigger sửa lại dữ liệu cho đúng:
Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database */
DROP TRIGGER IF EXISTS Question8; 
DELIMITER $$
CREATE TRIGGER Question8
BEFORE INSERT ON `Account`
FOR EACH ROW
	BEGIN
		IF NEW.Gender = 'Nam' THEN
		SET NEW.Gender = 'M';
		ELSEIF NEW.Gender = 'Nu' THEN
		SET NEW.Gender = 'F';
		ELSEIF NEW.Gender = 'Chưa xác định' THEN
		SET NEW.Gender = 'U';
	END IF ;
END $$
DELIMITER ;

/* Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
Sử dụng hàm DATE_SUB để lấy thời gian trước đó N ngày, sau đó so sánh 2 mốc thời
gian
Trong quá trình Demo, nếu báo 'Cant Delete This Exam!! Là đã thành công, còn trong TH
báo k thể xóa do liên quan đến khóa ngoại thì là đã Pass qua điều kiện. */
DROP TRIGGER IF EXISTS 	Question9;
DELIMITER $$
CREATE TRIGGER			Question9
BEFORE DELETE ON Exam
FOR EACH ROW
	BEGIN
		DECLARE 	Create_Date DATETIME;
		SET 		Create_Date = DATE_SUB(NOW(),INTERVAL 2 DAY);
		IF (OLD.CreateDate > Create_Date) THEN
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Cant Delete This Exam!!';
		END IF ;
	END $$
DELIMITER ;
DELETE 
FROM		Exam 
WHERE 		ExamID =1;

-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các question khi question đó chưa nằm trong exam nào
DROP TRIGGER IF EXISTS 	Question10;
DELIMITER $$
CREATE TRIGGER		 	Question10
BEFORE UPDATE ON	 Question
FOR EACH ROW
	BEGIN
		DECLARE		CountQuesID TINYINT UNSIGNED;
		SET 		CountQuesID = -1;
		SELECT 		count(1) INTO CountQuesID 
        FROM ExamQuestion  
        WHERE QuestionID = NEW.QuestionID;
		IF (CountQuesID != -1) THEN
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Cant Update This Question';
	END IF ;
	END $$
DELIMITER ;
UPDATE		 Question SET `Content` = 'Question VTI 2599 lL6 1'
WHERE		QuestionID = '253';
-- ----------------------------------------------------------------------------
DROP TRIGGER IF EXISTS 	Question10;
DELIMITER $$
CREATE TRIGGER 			Question10

BEFORE DELETE ON Question
FOR EACH ROW
	BEGIN
		DECLARE 	CountQuesID TINYINT;
		SET 		CountQuesID = -1;
		SELECT 		count(1) INTO CountQuesID 
		FROM 		ExamQuestion 
		WHERE 		ExamQuestion = OLD.QuestionID;
		IF (CountQuesID != -1) THEN
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Cant Delete This Question';
	END IF ;
	END $$
DELIMITER ;
DELETE 
FROM 		Question
WHERE 		QuestionID = '253';
            
/* Question 12: Lấy ra thông tin exam trong đó:
	Duration <= 30 thì sẽ đổi thành giá trị "Short time"
	30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
	Duration > 60 thì sẽ đổi thành giá trị "Long time" */

SELECT	Duration,
CASE	WHEN Duration <= 30 THEN "Short time"
		WHEN Duration <=60 THEN "Medium time"
        WHEN Duration > 60 THEN "Long time"
        END AS 'CHuyển Đổi'
FROM	Exam;

/* Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên là the_number_user_amount và mang giá trị được quy định như sau:
Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher */
SELECT		Count(GroupID) AS So_Luong,
CASE	WHEN 	Count(GroupID)<= 1 		THEN	'Few'
		WHEN	Count(GroupID) <= 2 	THEN	'Normal'
        WHEN	Count(GroupID) > 2	then	'Higher'
        END AS the_number_user_amount
FROM		GroupAccount
GROUP BY	GroupID;

-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào không có user thì sẽ thay đổi giá trị 0 thành "Không có User"
SELECT		DepartmentName, count(A.DepartmentID),
CASE		WHEN	count(A.DepartmentID)	=	0	THEN	"Không có User"
			END	So_luong
FROM		`Account`		AS	A
RIGHT JOIN	Department		AS	D
ON			A.DepartmentID = D.DepartmentID
GROUP BY	A.DepartmentID;





DROP TRIGGER IF EXISTS DELETE_QE;
DELIMITER $$
CREATE TRIGGER DELETE_QE
AFTER DELETE ON Question
FOR EACH ROW
	BEGIN 
			DELETE		
            FROM	Answer
            WHERE	QuestionID = OLD.QuestionID;
			
    END $$
DELIMITER ;
DELETE		
FROM	Answer
WHERE	QuestionID = 1;

