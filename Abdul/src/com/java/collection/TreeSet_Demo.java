package com.java.collection;
import java.util.*;
public class TreeSet_Demo {

	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add("A");
		s.add("A");
		s.add("A");
		s.add("Z");
		s.add("F");
		//s.add("A".compareTo("Z"));  //[-25]
		System.out.println(s);
		
	}

}
