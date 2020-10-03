package com.hcltrainings.jdbc.mysqldemo.loadingdriver;

public class DriverLoader {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName(driver);
		}catch(ClassNotFoundException e ) {
			System.err.println(e.getLocalizedMessage());
			System.err.println("Driver is not loaded");
		}
		
		System.out.println("Driver is connected Successfully");
		
	}
}
