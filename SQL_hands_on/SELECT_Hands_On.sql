/*1. Query to display the entire contends of the 'electricity_connection_type'. Display the records in ascending order based on their connection name */
SELECT * FROM `electricity_connection_type` ORDER BY `connection_name`;

/*2.Query to display entire contents of the 'building_type' sorted by name in ascending order */
SELECT * FROM `building_type` ORDER BY `name`;

/*3.Query to display records based on entire contents of the 'building' order by ownername*/
SELECT * FROM `building` ORDER BY `owner_name`;

/*4.entire content of `electricity_reading` display based on total_units descending */
SELECT * FROM `electricity_reading` ORDER BY `total_units` DESC;

/*5.Query to display all meter_number from meter tables*/
SELECT meter_number FROM meter;

/*6 Query to display the owner_name and contact_number of all building */
SELECT owner_name,contact_number FROM building ORDER BY owner_name;

/*7.Query to display the total_units,payable_amount,fine_amount of bills */
SELECT total_units,payable_amount,fine_amount FROM bills ORDER BY total_units;

/*8.Query to display entire content of slab*/
SELECT * FROM `slab` ORDER BY `from_unit`;

/*9. Display the building details whose owner_name is "Nicholas"*/
SELECT * FROM building WHERE owner_name LIKE "Nicholas";


CREATE TABLE bills(`total_units` INT(11),
					`name` VARCHAR(25));
TRUNCATE TABLE bills;
ALTER TABLE bills ADD COLUMN `dates` DATE;                    
INSERT INTO bills VALUES (1,"Siva",'2017-10-01'),(20000,"RAvi",'2017-10-01'),(300000,"ram",'2018-10-01');

/*10.Quert to display the details of bill whose total_units greater than 10000*/
SELECT * FROM bills WHERE total_units > 10000 ORDER BY total_units;


/*11.Query to display of all the bills with due_date on '2017-10-01*/
SELECT * FROM bills WHERE dates LIKE '2017-10-01' ORDER BY total_units DESC;

/*12. dispay owner_name,address and contact_number of the buildings */
SELECT owner_name,address,contact_number FROM building ORDER BY owner_name;


/*13. Owner name starts with M*/
SELECT * FROM building WHERE owner_name LIKE "M%";

/*14. Building with building type id 2*/
SELECT * FROM building WHERE building_type_id = 2 ORDER BY owner_name;

/*15.electricity_reading total units per day between 500 and 1000*/

SELECT * FROM electriciy_reading WHERE total_units BETWEEN 500 and 10000 ORDER BY total_units;

/*16. meter id and total units */
SELECT meter_id,total_units FROM electricity_reading WHERE h13 > h14 ORDER BY total_units;