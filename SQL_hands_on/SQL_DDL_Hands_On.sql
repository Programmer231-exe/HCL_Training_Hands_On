CREATE DATABASE `hcl_trainings_sqldemo`;
USE `hcl_trainings_sqldemo`;

/* 1. Write a query to create a table 'electricity_connection_type */
CREATE TABLE `electricity_connection_type`(
				`id` INT(11) NOT NULL ,
                `connection_name` VARCHAR(20) NOT NULL,
				PRIMARY KEY(id))

/* 2. Query to create a table 'slab' */
CREATE TABLE `slab`(
			`id` INT(11) ,
            `connection_type_id` INT(11) NOT NULL,
            `from_unit` INT(11) NOT NULL,
            `to_unit` INT(11) NOT NULL,
            `rate` DOUBLE NOT NULL,
            PRIMARY KEY(id),
            CONSTRAINT `fk` FOREIGN KEY (connection_type_id) REFERENCES electricity_connection_type(id))

DESC slab;

/* 3. Query to create a table 'building type' */
CREATE TABLE `building_type`(
			`id` INT(11),
            `name` VARCHAR(100) NOT NULL,
            `connection_type_id` INT(11) NOT NULL,
            PRIMARY KEY(id),
			CONSTRAINT `fk_bt`	FOREIGN KEY (connection_type_id) REFERENCES electricity_connection_type(id))
            
/*4.Write a query to create a table 'building' */


DROP TABLE `building`

CREATE TABLE `building`(
			`id` INT(11) NOT NULL,
            `owner_name` VARCHAR(100) NOT NULL,
            `address` VARCHAR(100) NOT NULL,
            `building_type_id` INT(11) NOT NULL,
            `contact_number` VARCHAR(100) NOT NULL,
            `email_address` VARCHAR(100) DEFAULT NULL,
            PRIMARY KEY(id),
            CONSTRAINT `f_key` FOREIGN KEY (building_type_id) REFERENCES building_type(id))
            
DESCRIBE `building`           


/*5. Write a Query to alter the column 'owner_name' to 'building_owner_name' in the table 'building' */
ALTER TABLE `building` CHANGE COLUMN `owner_name` `building_owner_name` VARCHAR(100) NOT NULL;
DESCRIBE `building`

/*6.Write a  query to change the datatype of the column address in the table 'building' to varchar(255) */

ALTER TABLE `building` MODIFY COLUMN `address` VARCHAR(255) NOT NULL;
DESCRIBE `building`;


/*7. Write a query to create a constraint which allows only 'commercial' or 'home' connection_name in the 
'electricity _connection_type' table.Specify  constraing name as 'check_connection_name' */I
DESCRIBE `electricity_connection_type`;

/*8.Query to rename table 'building' to 'building_details'  */
RENAME TABLE `building` TO `building_details`


/*9. Query to drop table 'slab' */
DROP TABLE `slab`

/*10. Query to drop table 'building_details' */
DROP TABLE `building_details`


/*11.Query to insert 2 records into the 'electricity_connection_type' */
SELECT * FROM electricity_connection_type
TRUNCATE `electricity_connection_type`
INSERT INTO `electricity_connection_type` VALUES (1,'home');
INSERT INTO `electricity_connection_type` VALUES (2,'Commercial');

/*12.Query to insert records into the slab table */
INSERT INTO `slab` VALUES (1,1,0,5,200.0);
INSERT INTO `slab` VALUES (2,2,2500,3000,500.0);
INSERT INTO `slab` VALUES (3,1,2500,3000,500.0);

DESCRIBE `building_type`


/*13.Query to insert 5 records into the building type table */
INSERT INTO `building_type` VALUES (1,'Ram Villa',2);
INSERT INTO `building_type` VALUES (2,'Shopping Mall',1);
INSERT INTO `building_type` VALUES (3,'BK Appartment',2);
INSERT INTO `building_type` VALUES (4,'Sathyam Theatre',1);
INSERT INTO `building_type` VALUES (5,'BTK Cologny',2);

/*14. Query to change from_unit value from 0 to 1 in the 'slab' table */
UPDATE `slab` SET from_unit = 1 WHERE `from_unit` = 0 AND id = 1;


/*15. Query to change name 'Shopping Mall' to "Mall' in the building_type table */
UPDATE `building_type` SET name = 'Mall' WHERE name LIKE 'Shopping Mall' AND id = 2; 

/*16. Delete Entire details of the table 'Slab' */
TRUNCATE `slab`;


/*17. Query to delete a rows from the table 'building_type where the electricity connection is home*/
DELETE FROM `electricity_connection_type` WHERE `connection_name` LIKE 'home' AND id = '2' ; 