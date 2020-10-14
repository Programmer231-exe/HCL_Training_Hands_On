package org.courserecommender.pojo;

import java.util.ArrayList;
import java.util.Collections;
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
	
	public void discount() {
		Course minFeeCourse = Collections.min(courseLists,new MyComparator());
		Course maxFeeCourse = Collections.max(courseLists,new MyComparator());
		
		System.out.println("Discount " + minFeeCourse.getFee() + " for " + minFeeCourse.getName() + " Course");
		System.out.println("Discoutn " + maxFeeCourse.getFee() + " for " + minFeeCourse.getName() + " Course");
	}
	
	

	
}
