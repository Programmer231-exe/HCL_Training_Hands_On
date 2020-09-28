/*1*/
SELECT owner_name,LENGTH(owner_name) AS name_length FROM building ORDER BY owner_name;

/*2*/
SELECT owner_name,contact_number FROM building WHERE LENGTH(owner_name) = (SELECT MIN(LENGTH(owner_name)) FROM building) ORDER BY owner_name;

/*3*/
SELECT CONCAT(owner_name,'-',contact_number,'-',email_address) AS contact_details FROM building ORDER BY owner_name DESC;

/*4*/
SELECT SUBSTR(meter_number,1,3) FROM meter ORDER BY meter_number;

/*5*/
SELECT LEFT(owner_name,3) AS name_code,contact_number  FROM building ORDER BY owner_name;

/*6*/
SELECT * FROM building WHERE owner_name LIKE '%di%';

/*7*/
SELECT COUNT(*) AS bill_paid_withoutfine FROM BILL WHERE payment_date < due_date AND month = 10 AND year = 2017; 

/*8*/
SELECT SUM(fine_amount) AS total_fine FROM bill WHERE payment_date BETWEEN '2017-10-01' AND '2017-11-01';

/*9*/


/*10*/
SELECT due_date,payable_amount FROM bill WHERE payment_date NOT BETWEEN '2017-08-21' AND '2017-08-24';

/*Subqueries*/

/*1*/
SELECT * FROM bills AS b INNER JOIN meter AS m ON m.id = b.meter_id; 

/*2*/
SELECT m.meter_number,b.owner_name,b.address,b.contact_number FROM meter AS m INNER JOIN  building AS b ON m.building_id = b.building_type_id ORDER BY m.meter_number; 

/*3*/
SELECT m.meter_number,b.owner_name,b.address,b.contact_number,bt.name AS building_type_name FROM METER AS m NATURAL JOIN building AS b NATURAL JOIN building_type AS bt ORDER BY b.owner_name AND m.meter_number;

/*4*/
SELECT ect.connection_name,sb.from_unit,sb.to_unit,sb.rate FROm electricity_connection_type AS ect INNER JOIN slab sb ON ect.id = sb.connection_type_id ORDER BY sb.rate; 

/*5*/
SELECT * FROM building AS b NATURAL JOIN meter AS m NATURAL JOIN bills AS bl WHERE bl.fine_amount IN (SELECT MAX(fine_amount) FROM bill) ORDER BY b.owner_name;
