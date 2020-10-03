package com.hcltrainings.jdbc.mysqldemo.imagedemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Running");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
			System.out.println("Connection to databalse");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO imagetable VALUES (?,?)");
			FileInputStream fis = new FileInputStream("Resources/uhost-icon.png");
			System.out.println(fis.available());
			ps.setString(1, "uhost");
			ps.setBinaryStream(2,fis,fis.available());
			int i = ps.executeUpdate();
			System.out.println(i + " rows affected");
			conn.close();
			
		}catch(Exception e) {
			System.out.println("Exception occurs");
			e.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Running");
			Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
			System.out.println("Connection to databalse");
			PreparedStatement ps = conn2.prepareStatement("SELECT * FROM imagetable");
			ResultSet rs = ps.executeQuery();
			rs.next();
			Blob b = rs.getBlob(2);
			byte[] barr = new byte[(int)b.length()];
			FileOutputStream fout = new FileOutputStream("Resources/return.jpg");
			fout.write(barr);
			fout.close();
			System.out.println("Ok");
			conn2.close();
			
		}catch(Exception e) {
			System.out.println("Exception occurs");
			e.printStackTrace();
		}

	}

}
