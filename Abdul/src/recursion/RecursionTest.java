package recursion;
class Demo extends Thread{
	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		    	Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);
		    	}  
		    }
		    System.out.println();  
		    String s="abc";
			s=s+"d";
			System.out.println(s);
		  }
}
public class RecursionTest {
	
	public static void main(String[] args) {

	}
}
