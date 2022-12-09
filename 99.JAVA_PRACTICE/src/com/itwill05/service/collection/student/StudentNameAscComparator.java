package com.itwill05.service.collection.student;

import java.util.Comparator;

public class StudentNameAscComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName()) > 0 ? 1 : 
			o1.getName().compareTo(o2.getName()) < 0 ? -1 :0;
	}


}
