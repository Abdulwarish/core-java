package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {

	static	void add() {
			System.out.println("add");
		}
	
	public static void main(String[] args) {

/*		Object a[] = new Object[5];
		
		int b[] = {9,4,5,7};
		
			a[1]=2;
			a[3]="A";
			
			System.out.println(a[1]);
*/		
			//Test.add();
		ArrayList<Integer> obj = new ArrayList<>();
		
				obj.add(2);
				obj.add(1);
				obj.add(1);
				obj.add(6);
				obj.add(1);
				obj.add(10);
				obj.add(15);
				
				
				//Collections.sort(obj);
				
				//System.out.println(obj);
			
				Iterator<Integer> itr = obj.iterator();
				
				//
				for(int i=0;itr.hasNext();i++) {
					//obj.remove(15);
				}
//			//	Collection ob=				
				
		/*	for (Integer s:obj) {
				System.out.print(s+" ");
			}	*/
				
	}

}
