package logicalquestion;

public class ReverStringincentre {

	public static void main(String[] args){
		  int e = 0;
		String s = "My Name! is Khan";
		String[] s1 = s.split("\\s");
		for (int i = s1.length - 1; i >= 0; i--) {
				System.out.print(s1[i] +" ");
		}
		StringBuffer abc=new StringBuffer("abc");
		System.out.println(abc.capacity());
		//Another way
		/*public class Main
		{
			public static void main(String[] args) {
			 String s="my name! is khan";
			 String []s1=s.split("\\s");
			 for(int i=s1.length-1;i>=0;i--){
			     if(i>1){
			         System.out.print(s1[i]+" ");
			  }
			 }
			 for(int i=0;i<=1;i++){
			     System.out.print(s1[i]+" ");
			 }
			}
		}*/

		
	}
}
