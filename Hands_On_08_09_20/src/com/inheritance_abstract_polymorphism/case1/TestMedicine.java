package com.inheritance_abstract_polymorphism.case1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;



public class TestMedicine {

	public static void main(String[] args) throws Exception {
		
		Medicine[] medicines = getDetails();
		
		for(Medicine medicine : medicines) {
			medicine.getDetails();
			medicine.displayLabel();
		}
		
	}
	
	private static Medicine[] getDetails() throws Exception {
		Medicine[] medicines = new Medicine[5];
		String name;
		double price;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date; 
		String detail;
		String[] splitted_detail;
		Random rand;
		int choice;
		
		for(int i = 0; i < 5 ; i++) {
			rand = new Random();
			choice = rand.nextInt(3);
			System.out.println(choice);
			String medicineType;
			if(choice == 0) {
				medicineType = "Tablet";
			}else if(choice == 1) {
				medicineType = "Syrup";
			}else{
				medicineType = "Ointment";
			}
			
			System.out.println("Enter the" + medicineType +  " Details");
					
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			detail = br.readLine();
			splitted_detail = detail.split(",");
			name = splitted_detail[0];
			price = Double.parseDouble(splitted_detail[1]);
			date = LocalDate.parse(splitted_detail[2],formatter);
			medicines[i] = createObject(medicineType,name,price,date);
			
		}
		
		return medicines;
	}			
	
	private static Medicine createObject(String className,String name, double price,LocalDate expiryDate) throws Exception {
		Medicine medicine = (Medicine)Class.forName("com.inheritance_abstract_polymorphism.case1." +className).newInstance();
		medicine.setName(name);
		medicine.setPrice(price);
		medicine.setExpiryDate(expiryDate);
		
		return medicine;
		
	}
	
}
