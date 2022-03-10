package com.comprator;

import java.util.Comparator;

class AgeComparator implements Comparator<StudentDemo> {
	
	public int compare(StudentDemo s1, StudentDemo s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}