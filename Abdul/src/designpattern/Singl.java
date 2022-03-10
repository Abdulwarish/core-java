package designpattern;
class DemoSingle{
	static DemoSingle obj=new DemoSingle();
	private DemoSingle() {
		
	}
	static DemoSingle m1() {
		System.out.println("Hello i am single ton");
		return obj;
		
	}
}
public class Singl {

	public static void main(String[] args) {
		DemoSingle.m1();
	}

}
