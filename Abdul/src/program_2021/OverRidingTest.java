package program_2021;

import java.util.HashMap;
import java.util.Map;

class Help {
	public void m() {
		System.out.println("Hi");
	}
}

public class OverRidingTest extends Help {

	public void m() {
		System.out.println("OverRiding");
	}
	public static void main(String[] args) {
		OverRidingTest v = new OverRidingTest();
//		v.m();
		Map<String,String> map = new HashMap();
		map.put("1", "Waris Khan");
		map.put("2", "Shaheda Khan");
		for (Map.Entry<String, String> string : map.entrySet()) {
			System.out.println(string.getKey()+" "+string.getValue());
		}
	}
}
