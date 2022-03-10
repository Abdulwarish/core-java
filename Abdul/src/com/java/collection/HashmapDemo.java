package com.java.collection;

import java.util.*;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap();
		hm.put(3, "Waris");
		hm.put(7, "khan");
		hm.put(4, "kl");
		hm.put(2, "obaid");
		hm.put(1, "obaid");
		Set set = hm.entrySet();
		/*
		 * Iterator itr=set.iterator(); while(itr.hasNext()) { Map.Entry
		 * ob=(Entry)itr.next(); System.out.println(ob.getKey()+" "+ob.getValue()); }
		 */

		hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEachOrdered(System.out::println);
	}

}
