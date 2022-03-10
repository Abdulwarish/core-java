package navinreddycorejava;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int a=2,b,c;
		
		/*if(a==1)
			c=6;
		else
			c=9;*/
		
		c=a==1?6:9;//Ternary Operator replace the if else
		System.out.println(c);
		
		Object obj;
		obj=true?new Integer(10):new Double(34.4);
		System.out.println(obj);
	}

}
