package com.comprable;
//Java Program to demonstrate the use of Java Comparable.  
//Creating a class which implements Comparable Interface  
import java.util.ArrayList;
import java.util.Collections;

//Creating a test class to sort the elements  
public class ComprableTest 
{
	public static void main(String args[]) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 10));
		al.add(new Student(106, "Ajay", 9));
		al.add(new Student(105, "Jai", 4));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}