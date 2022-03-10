//Method Overloading: changing no. of arguments
package Demo;
/*class Method{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b;
	}
	
}
public class Metho_over {

	public static void main(String[] args) {
		System.out.println(Method.add(12,30));
		System.out.println(Method.add(12,24,54));

	}

}
*/
//Method Overloading: changing data type of arguments
class Method{
	static int add(int a,int b) {
		return a+b;
	}
	static float add(float a,float b,float c) {
		return a+b+c;
	}
	
}
public class Metho_over {

	public static void main(String[] args) {
		System.out.println(Method.add(17,30));
		System.out.println(Method.add(12,24,54));

	}

}

