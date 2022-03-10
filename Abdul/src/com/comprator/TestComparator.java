package com.comprator;

import java.util.ArrayList;
import java.util.Collections;

class TestComparator {
	public static void main(String args[]) {
		
		ArrayList<StudentDemo> al = new ArrayList<StudentDemo>();
		al.add(new StudentDemo(101, "Vijay", 23));
		al.add(new StudentDemo(106, "Ajay", 27));
		al.add(new StudentDemo(105, "Jai", 21));

		System.out.println("Sorting by Name");
		Collections.sort(al, new NameComparator());
		for (StudentDemo st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by Age");
		Collections.sort(al, new AgeComparator());

		for (StudentDemo st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}