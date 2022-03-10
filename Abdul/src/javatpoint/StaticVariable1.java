package javatpoint;

public class StaticVariable1 {
	static int a=m1();
	static {
		System.out.println("Inside static block");
	}
	static int m1() {
		System.out.println("From m1");
		return 10;
		}
	public static void main(String[] args) {
		System.out.println("Value of A:"+a);
		System.out.println("from main");
	}
}
