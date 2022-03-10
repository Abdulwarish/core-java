
public class Demoimpl implements Demo{

	@Override
	public void m1() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Demo o=new Demoimpl();
		o.m1();
		o.m2();
		System.out.println("A="+Demo.a+" B="+Demo.b);
	}

	@Override
	public void m2() {
		System.out.println("hello");
		
	}
}
