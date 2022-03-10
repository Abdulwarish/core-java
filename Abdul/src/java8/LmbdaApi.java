package java8;

import java.util.ArrayList;
import java.util.List;

public class LmbdaApi {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("WAris");
		list.add("Khan");
		list.add("Majid");
		list.add("Abdul");
		list.stream().forEach(x->System.out.println(x));
	}
}
