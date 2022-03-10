package test;
class Parent1{
	void car(){
		System.out.println("baleno");
	}
}
class Child1 extends Parent1{
	void bike1(){
		System.out.println("Bike");
	}
}
class Child2 extends Parent1{
	void home(){
		System.out.println("my home");
	}
}
public class HirachiInh {
public static void main(String args[]){
	Child2 d =new Child2();
	d.car();
	d.home();
	
	
}
}
