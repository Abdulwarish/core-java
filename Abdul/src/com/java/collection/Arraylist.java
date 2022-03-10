package com.java.collection;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.util.TreeSet;
import java.util.Vector;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		ArrayList a1=new ArrayList();
		LinkedList a2=new LinkedList();
		Vector a3=new Vector();
	
		//System.out.println(list);
			list.add("A");
			list.add("A");
			list.add("B");
			list.add("C");
			
			System.out.println(a1 instanceof Serializable ); //true
			//System.out.println(a2 instanceof Clonable); //true

			System.out.println(a1 instanceof RandomAccess); //true
			System.out.println(a2 instanceof RandomAccess); //false
			System.out.println(list instanceof Serializable);
			Iterator itr=list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println(list);
				
			}
	}
	

}
