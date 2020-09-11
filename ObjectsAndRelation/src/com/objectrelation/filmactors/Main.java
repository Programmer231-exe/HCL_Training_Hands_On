package com.objectrelation.filmactors;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		
		
		Film film;
		film = FilmManagement.generateFilm();
		film.displayFilmDetails();
		
		
		

	}

}
