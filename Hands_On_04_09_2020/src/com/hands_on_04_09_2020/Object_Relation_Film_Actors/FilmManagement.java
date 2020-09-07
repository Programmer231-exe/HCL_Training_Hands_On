package com.hands_on_04_09_2020.Object_Relation_Film_Actors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilmManagement {
	
	public static Film generateFilm() throws IOException {
		
		String filmDetails;
		String[] filmDetail;
		int filmId;
		String filmName;
		Actor[] actors;
		int actorCount;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Film film;
		System.out.println("\nEnter Film Details : (id, name)");
		filmDetails = br.readLine();
		filmDetail = filmDetails.split(",");
		filmId = Integer.parseInt(filmDetail[0]);
		filmName = filmDetail[1];
		System.out.println("How many Actors " + filmName + "?");
		actorCount = Integer.parseInt(br.readLine());
		actors = generateActors(actorCount);
		film = new Film(filmId,filmName,actors);
		return film;
		
	}
	private static Actor[] generateActors(int actorCount)  throws IOException{
		int actorId;
		String actorName;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Actor actors[] = new Actor[actorCount];
		String actorDetails;
		String[] actorDetail;
		System.out.println("\nEnter Actor Details: (id,name");
		for(int i =0; i < actorCount; i++) {
			actorDetails = br.readLine();
			actorDetail = actorDetails.split(",");
			actorId = Integer.parseInt(actorDetail[0]);
			actorName = actorDetail[1];
			actors[i] = new Actor();
			actors[i].setId(actorId);
			actors[i].setName(actorName);
		}
		
		return actors;

	}
	}