package com.java.collection;
import java.util.*;
public class LinkedHashSet_test {

	public static void main(String[] args) {
		LinkedHashSet s=new LinkedHashSet();
		s.add("A");
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("D");
		s.add("Z");
		s.add(null);
		s.add(null);
		s.add("A");
		System.out.println(s);
		
	}

}
