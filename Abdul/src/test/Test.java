package test;

public class Test {
	void add() {
		int a=10,b=20;
		System.out.println(a+b);
	}
class B extends Test{
	void mult(){
	int c=10,d=20;
	System.out.println(c*d);
	}
	public void main(String args[]){
		
		B obj=new B();
		obj.mult();
	}
}

}