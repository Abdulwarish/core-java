package com.java.collection;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Abdul");
		l.add("30");
		l.add(null);
		l.add("waris");
		l.set(0, "abdulwaris");
		l.add(0, "waris");
		l.addFirst("java");
		System.out.println(l);//[java,waris,abdulwaris,30,null,waris,]
	}

}
