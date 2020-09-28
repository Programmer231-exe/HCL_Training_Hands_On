USE hcl_trainings_sqldemo;
/* AGGREGATE FUNCTION HANDS ON */

/*1*/
SELECT AVG(h8) AS `average_8th_hour_consumption` FROM `electricity_reading`;

CREATE TABLE bill(id int(11),
				total_units int(11))

ALTER TABLE bill add column dates DATE;

INSERT INTO bill VALUES (1,10000,'2017-08-23'),(2,20000,'2017-08-22'),(3,30000,'2017-09-03');
/*2*/
SELECT AVG(total_units) AS average_unit_of_electricity  FROM `bill`;

/*3*/
SELECT AVG(payable_amount) AS average_payable_amount FROM bill WHERE payable_amount > 10000;

/*4*/
SELECT AVG(fine_amount) AS average_fine_amount FROM bill WHERE YEAR(payment_date) = 2018;

/*5*/
SELECT SUM(payable_amount) AS sum_payable_amount FROM bill; 

SELECT * FROM `electriciy_reading`
/*6*/
SELECT SUM(payable_amount) AS sum_payable_amount FROM bill WHERE due_date LIKE '2017-10-01';

/*7*/
SELECT MIN(total_units) AS min_total_units FROM `electricity_reading`;


/*8*/
SELECT total_units AS second_min_fine FROM electriciy_reading WHERE total_units > (SELECT MIN(total_units) FROM electriciy_reading) ORDER BY total_units LIMIT 1;

/*9*/
SELECT month,MIN(total_units) AS minimum_units FROM bill GROUP BY month;

/*10*/
SELECT STDDEV(fine_amount) AS standard_deviation_amount FROM electricity_reading WHERE YEAR(payment_date) = 2018; 
