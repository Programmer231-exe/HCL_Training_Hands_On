package org.courserecommender.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CourseList {
	private List<Course> courseLists = new ArrayList<Course>();
	
	public void insert(Course course) {
		if(course != null) {
			courseLists.add(course);
		}
	}
	
	
	public List<Course> getCourseLists() {
		return courseLists;
	}


	public void setCourseLists(List<Course> courseLists) {
		this.courseLists = courseLists;
	}


	public double revenue() {
		double revenue = 0.0;
		for(Course course : courseLists) {
			revenue += course.getFee() * 0.2 * 200;
		}
		return revenue;
	}
	
	public void display() {
		for(Course course : courseLists) {
			course.display();
		}
	}
}
