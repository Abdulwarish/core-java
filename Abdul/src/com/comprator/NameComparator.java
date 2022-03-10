package com.comprator;

import java.util.*;

class NameComparator implements Comparator<StudentDemo> {
	public int compare(StudentDemo s1, StudentDemo s2) {
		return s1.name.compareTo(s2.name);
	}
}