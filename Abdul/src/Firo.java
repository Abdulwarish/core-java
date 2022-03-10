import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Firo{
	public static void main(String[] args){
		List l=new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("B");
		Iterator itr =l.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//-------------------------
		List l1=new LinkedList();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("A");
		Iterator itr1 =l1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		//-------------------------
		
		
	}
	
}