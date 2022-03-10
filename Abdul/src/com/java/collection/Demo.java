package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
public static void main(String[] args) {
	ArrayList <String> list=new ArrayList<String>();
	list.add("Sarfaraz");
	list.add("khan");
	list.add("Sarf");
	list.add("froz");
	list.add("froz");
	list.add("abdul waris");
	list.add("froz");
	list.add("tahir");
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
