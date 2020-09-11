package com.objectrelation.filmsongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		
		int count;
		int songCount;
		String filmName;
		Film[] films;
		Songs[][] songs;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many films?");
		count = Integer.parseInt(br.readLine());
		films = new Film[count];
		songs = new Songs[count][];
		for(int i = 0; i < count; i++) {
			films[i] = FilmManagement.generateFilm();
			System.out.println("How many songs in film " + films[i].getName());
			songCount = Integer.parseInt(br.readLine());
			songs[i] = new Songs[songCount];
			System.out.println("\nEnter Song Details: (id: name: singers");
			songs[i] = FilmManagement.generateSongs(songCount, films[i].getId());
		}
	
		System.out.println("Enter the Film Name");
		filmName = br.readLine();
		System.out.println("Songs of Film " + filmName);
		FilmManagement.getFilmSongs(filmName,films,songs);
	}

}
