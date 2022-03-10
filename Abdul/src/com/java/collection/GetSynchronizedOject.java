package com.java.collection;
import java.util.*;

import javax.print.attribute.SetOfIntegerSyntax;
public class GetSynchronizedOject {

	public static void main(String[] args){
		ArrayList l1=new ArrayList();
		List l=Collections.synchronizedList(l1);
		System.out.println(l1);
		System.out.println(l);
		
		//public static Set synchronizedSet(Set s);

	}

}
