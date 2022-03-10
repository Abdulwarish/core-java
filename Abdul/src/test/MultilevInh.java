package test;

class Parent{
	void fly(){
		System.out.println("bird is flying");
	}
}
class Child extends Parent{
	void Run(){
		System.out.println("Animal is running");
	}
}
class Dog extends Child{
	void see(){
		System.out.println("Dog is eating");
	}
}

public class MultilevInh {
public static void main(String args[]){
	Dog d=new Dog();
	d.fly();
	d.see();
	d.Run();
}
}



