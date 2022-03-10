package javatpoint;

public class StaticVariable {
	static int a=10;
	static int b=20;
	static {
		a+=b;
	}
	public static void main(String[] args) {
		System.out.println("static block auto execute");
		System.out.println(a);
	}
}
