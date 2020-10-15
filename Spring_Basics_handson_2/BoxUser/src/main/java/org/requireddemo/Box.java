package org.requireddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Box {
	
	
	private User user;
	private int length;
	private int width;
	public User getUser() {
		return user;
	}
	
	@Autowired(required = true)
	public void setUser(User user) {
		this.user = user;
	}
	public int getLength() {
		return length;
	}
	
	@Value("10")
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	
	@Value("12")
	public void setWidth(int width) {
		this.width = width;
	}
	public Box() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Box(User user, int length, int width) {
		super();
		this.user = user;
		this.length = length;
		this.width = width;
	}
	
	public void display() {
		System.out.println("The hall of length " + this.getLength() + " and width " + this.getWidth()  + " is owned by " + this.getUser().getName());
	}
}
