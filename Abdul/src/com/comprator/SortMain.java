package com.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class SortMain {
	 public static void main(String[] args) {
		    Map<Object, Object> handler = new LinkedHashMap<Object, Object>();
		    handler.put("item", "Zalue");
		    handler.put(2, "Movies");
		    handler.put("isAlive", "A");

		    for (Map.Entry<Object, Object> entrY : handler.entrySet())
		        System.out.println(entrY.getKey() + "  |  " + entrY.getValue());

		    List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>();
		    Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
		        public int compare(Map.Entry<String, Integer> a,
		                Map.Entry<String, Integer> b) {
		            return a.getValue().compareTo(b.getValue());
		        }
		    });
		}
}
