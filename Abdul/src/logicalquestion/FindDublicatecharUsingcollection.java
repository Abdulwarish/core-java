package logicalquestion;

import java.util.HashMap;
import java.util.Map;

public class FindDublicatecharUsingcollection {
public static void main(String[] args) {
	
	String str = "asdfasdfafk asd234asda";
	Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	char[] arr = str.toCharArray();
	
	for (char value: arr) {
		
		if (Character.isAlphabetic(value)) {
			if (charMap.containsKey(value)) {
				charMap.put(value, charMap.get(value) + 1);
				
			} else {
				charMap.put(value, 1);
			}
		}
	}
	
	System.out.println(charMap);
}
}
