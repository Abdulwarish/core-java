package com.java.collection;
import java.util.*;
public class Sortedset_Demo {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("F");
		s.add("G");
		s.add("H");
		s.add("I");
		s.add("J");
		/*for(Object obj:s) {
			System.out.println(obj);
		}*/
		System.out.println(s.first());  //A
		System.out.println(s.last());    //J
		System.out.println(s.headSet("F"));//[A, B, C, D, E]
		System.out.println(s.tailSet("H"));//[H, I, J]
		System.out.println(s.subSet("D", "H"));//[D, E, F, G]
		System.out.println(s.comparator());//NULL
	}

}
