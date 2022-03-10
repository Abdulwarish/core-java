package Demo;

class Parent{
	int a;
	
	public Parent() {
		
		System.out.println("Paretn class constructor");
	}
}
class Child1 extends Parent{
	int b;
	Child1(){

		System.out.println("Chils class constructotr");
	System.out.println(this.hashCode()+" "+super.hashCode());
	System.out.println(this.getClass()+"  "+super.getClass());
	}
}
public class Test {
	public static void main(String[] args) throws InterruptedException {
		Child1 o=new Child1();
		System.out.println("Main  "+o.hashCode());
		System.out.println("sleeping...");
		Thread.sleep(5*60*1000);
	}
}
