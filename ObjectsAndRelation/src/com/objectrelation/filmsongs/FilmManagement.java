package com.objectrelation.filmsongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilmManagement {
	
	public static Film generateFilm() throws IOException{
		
		String filmDetails;
		String[] filmDetail;
		int filmId;
		String filmName;
		Film film;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter Film Details : (id, name)");
		filmDetails = br.readLine();
		filmDetail = filmDetails.split(",");
		filmId = Integer.parseInt(filmDetail[0]);
		filmName = filmDetail[1];
		film = new Film(filmId,filmName);
		return film;
	}
	
	public static Songs[] generateSongs(int songCount,int filmId)  throws IOException{
		int songId;
		String songName;
		String singers;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Songs[] songs = new Songs[songCount];
		String songDetails;
		String[] songDetail;
		for(int i =0; i < songCount; i++) {
			songDetails = br.readLine();
			songDetail = songDetails.split(":");
			songId = Integer.parseInt(songDetail[0]);
			songName = songDetail[1];
			singers = songDetail[2];
			songs[i] = new Songs(songId, songName, singers, filmId);
		}
		
		return songs;

	}
	
	
	public static void getFilmSongs(String filmName,Film[] films, Songs[][] songs) {
		int songIndex = Film.getFilmId(filmName, films);
		
		for(Songs song : songs[songIndex]) {
			song.displaySongDetais();
		}
		
	}

		
	}
/*
public class FilmManagement {
	
	public static Film[] generateFilm(int count) throws IOException {
		
		String filmDetails;
		String[] filmDetail;
		int filmId;
		String filmName;
		Songs[] songs;
		int songCount;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Film[] films = new Film[count];
		for(int i = 0; i < count ; i++) {
			System.out.println("\nEnter Film Details : (id, name)");
			filmDetails = br.readLine();
			filmDetail = filmDetails.split(",");
			filmId = Integer.parseInt(filmDetail[0]);
			filmName = filmDetail[1];
			System.out.println("How many Songs in " + filmName);
			songCount = Integer.parseInt(br.readLine());
			songs = generateSongs(songCount,filmId);
			films[i] = new Film(filmId,filmName,songs);
		}
		return films;
		
	}
	private static Songs[] generateSongs(int songCount,int filmId)  throws IOException{
		int songId;
		String songName;
		String singers;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Songs[] songs = new Songs[songCount];
		String songDetails;
		String[] songDetail;
		System.out.println("\nEnter Song Details: (id: name: singers");
		for(int i =0; i < songCount; i++) {
			songDetails = br.readLine();
			songDetail = songDetails.split(":");
			songId = Integer.parseInt(songDetail[0]);
			songName = songDetail[1];
			singers = songDetail[2];
			songs[i] = new Songs(songId, songName, singers, filmId);
		}
		
		return songs;

	}
	
	public static void getFilmSongs(String filmName,Film[] films) {
		
		int filmId = Film.getFilmId(filmName,films);
		Songs[] songs;
 		for(int i = 0; i < films.length; i++) {
			if(filmId == films[i].getId()) {
				songs = films[i].getSongs();
				for(Songs song: songs) {
					song.displaySongDetais();
				}
			}
		}
		
	}
}*/