package com.hands_on_04_09_2020.Object_Relation_Film_Songs;

public class Film {
	private int id;
	private String name;
	
	
	public Film() {
		
	}
	
	
	public Film(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getFilmId(String filmName, Film[] films) {
		
		int rowNumber = -1;
		for(int i = 0; i < films.length; i ++) {
			if(filmName.equals(films[i].getName()))
				rowNumber = i;
		}
		
		return rowNumber;
		
		
	}
	
	
}
