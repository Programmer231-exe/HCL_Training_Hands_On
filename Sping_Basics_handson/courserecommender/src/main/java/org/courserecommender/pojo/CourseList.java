package org.courserecommender.pojo;

import java.util.ArrayList;
import java.util.List;

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


	public List<String> noOfCourse(Double budget){
		int count;
		List<String> availableCourse = new ArrayList<String>();
		for(Course course: this.courseLists) {
			if(course.getFee() > budget) {
				
			}
			else {
				count = (int) ( budget/course.getFee());
				availableCourse.add(course.getName()+"-"+count);
			}
		}
		return availableCourse;
	}
}
