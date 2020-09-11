package com.objectrelation.filmsongs;

public class Songs {
	
	private int id;
	private String name;
	private String singers;
	private int film_id;
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
	public String getSingers() {
		return singers;
	}
	public void setSingers(String singers) {
		this.singers = singers;
	}
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public Songs(int id, String name, String singers, int film_id) {
		super();
		this.id = id;
		this.name = name;
		this.singers = singers;
		this.film_id = film_id;
	}
	
	
	public void displaySongDetais() {
		System.out.println("\nSong Name : "+this.getName() +
							"\nSingers  : " +this.getSingers() );
		
	}
	
	

}
