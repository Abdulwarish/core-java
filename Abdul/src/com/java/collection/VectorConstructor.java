package com.java.collection;

import java.util.Vector;

public class VectorConstructor {

	public static void main(String[] args) {
		Vector v=new Vector(10 ); 
		System.out.println(v.capacity());
		for(int i=1;i<=25;i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("Abdyl");
		
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
