package com.objectrelation.filmactors;

public class Film {
	private int id;
	private String name;
	private Actor[] actors;
	public Film(int id, String name, Actor[] actors) {
		super();
		this.id = id;
		this.name = name;
		this.actors = actors;
	}
	public Film() {
		super();
		// TODO Auto-generated constructor stub
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
	public Actor[] getActors() {
		return actors;
	}
	public void setActors(Actor[] actors) {
		this.actors = actors;
	}
	
	public void displayFilmDetails() {
		System.out.println("\nFilm Details :" 
						+  "\nFilm Name : " + this.getName() 
						+  "\n\nActors : \n");
		
		for(Actor actor : this.getActors()) {
			System.out.println(actor.getName());
		}
	}
}
