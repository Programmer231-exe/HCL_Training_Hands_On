package org.courserecommender.pojo;

import java.util.Comparator;

public class MyComparator implements Comparator<Course>{
	
	public int compare(Course course1,Course course2) {
		if(course1.getFee() > course2.getFee()) {
			return 1;
			
		}else if(course1.getFee() < course2.getFee()) {
			return -1;
		}else {
			return 0;
		}
	}

}
