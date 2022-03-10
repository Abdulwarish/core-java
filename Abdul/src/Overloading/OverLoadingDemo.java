package Overloading;
class OO{
	void m1() {
		System.out.println("A");
	}
	void m1(int a) {
		System.out.println("B");
	}
}
public class OverLoadingDemo extends OO {
	void m1(int a,int c) {
		System.out.println("C");
	}
	public static void main(String[] args) {
		OverLoadingDemo o=new OverLoadingDemo();
		o.m1();
		o.m1(10);
		o.m1(2, 4);
		
	}

}
