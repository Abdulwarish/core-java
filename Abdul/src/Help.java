import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

//SingleTone Class Example
public class Help {
	static private Help instance;
	int no;
	private Help() {
		no=100;
	}
	public static Help getInstance() {
		if(instance == null) {
			instance = new Help();
		}
		return instance;
	}
	public static void main(String[] args) {
		HashSet<String> s = new HashSet<>();
		s.add("a");
		TreeSet<String> t = new TreeSet<>();
		t.add("4");
		t.stream().forEach((a)-> {
//			System.out.println(a);
		});
		HashMap<String, String> hm = new HashMap<>();
		hm.put(null,"ds");
		hm.forEach((a,b)-> System.out.println(a+b));
		Help h = Help.getInstance();
//		System.out.println(h.no);
		
		String [] array = new String[3];
		array[0]="a";
		array[1]="b";
		array[2]="c";
		for (String string : array) {
			System.out.println(string);
		}
		
		List<String> l = new ArrayList<String>();
		l = Arrays.asList(array);
		l.stream().forEach(a->{
			System.out.println(a);
		});
		
		String[] arrrr = l.stream().toArray(String[]::new);
		for (String string2 : arrrr) {
			System.out.println("===>>>>"+string2);
		}
	}
}

