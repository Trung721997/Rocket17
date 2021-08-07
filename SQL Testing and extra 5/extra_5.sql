USE `adventureworks`;

-- Exercise 1
-- Question 1: CTE
WITH So_Luong AS (
					SELECT		`ProductSubcategoryID`
					FROM		`productsubcategory`
					WHERE		`Name` = 'Saddles'
                    )
SELECT		p.`Name`
FROM		`product` 				AS 	P
LEFT JOIN	`productsubcategory`	AS PS
ON			P.`ProductSubcategoryID` = PS.`ProductSubcategoryID`
WHERE		P.`ProductSubcategoryID` IN 	(SELECT		*
											 FROM		So_Luong);

-- Question 1: Subquery
SELECT		p.`Name`
FROM		`product` 				AS 	P
LEFT JOIN	`productsubcategory` 	AS PS
ON			P.`ProductSubcategoryID` = PS.`ProductSubcategoryID`
WHERE		P.`ProductSubcategoryID` IN	(SELECT		`ProductSubcategoryID`
										FROM		`productsubcategory`
										WHERE		`Name` = 'Saddles');

-- Question 2:
SELECT		`Name`
FROM		`product`
WHERE		`Name` LIKE	'%Bot%';

-- Question 3: CTE
WITH cte_rs  AS (
				SELECT		`ListPrice` as sl
				FROM		`product`
				WHERE 		`ProductSubcategoryID` =3
                ) 
SELECT 			`Name`
FROM			`product`
WHERE 			`ListPrice` = 	(SELECT 	 MIN(sl)
								 FROM 		 cte_rs );

-- -- Question 3: Subquery
SELECT 		`Name`
FROM 		`product` 	
WHERE		`ListPrice` =	(SELECT		min(`ListPrice`)
							 FROM 		`product`
							 WHERE		`ProductSubcategoryID` = 3) ;
                             
                             
-- Exercise 2
-- Question 1:
SELECT		CT.`Name`, A.City
FROM		stateprovince 	AS SP
JOIN		address			AS	A			ON 	SP.StateProvinceID = A.StateProvinceID
JOIN		countryregion 	AS CT			ON	SP.CountryRegionCode = CT.CountryRegionCode;

-- Question 2:
SELECT		CT.`Name`, A.City
FROM		stateprovince 	AS SP
JOIN		address			AS	A			ON 	SP.StateProvinceID = A.StateProvinceID
JOIN		countryregion 	AS CT			ON	SP.CountryRegionCode = CT.CountryRegionCode
WHERE		CT.`Name` IN ('Canada', 'Germany');

-- Question 3:
SELECT		SP.SalesPersonID, SP.Bonus, SP.SalesYTD, SD.SalesOrderID, SD.OrderDate
FROM		salesterritory 		AS	ST
JOIN		salesperson			AS	SP		ON	ST.TerritoryID	=	SP.TerritoryID
JOIN		salesorderheader	AS	SD		ON	ST.TerritoryID	=	SD.TerritoryID;

-- Question 4:
ALTER TABLE salesperson
DROP COLUMN	SalesPersonID;












											