import java.util.*;
public class Demoset{
	public static void main(String[] args) {
		try {
			ArrayList list=new ArrayList();//Creating arraylist
			list.add(1);//Adding object in arraylist    
			  list.add("Vijay");    
			  list.add("Ravi");    
			  list.add("Ajay");  
//	      list.removeAll(list);
			  //Invoking arraylist object 
			  list.set(2, "waris");
			  System.out.println(list.get(2));
		} 
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
