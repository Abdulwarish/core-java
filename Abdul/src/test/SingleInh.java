package test;
class Bird{
	void fly(){
		System.out.println("bird is flying");
	}
}
class Animal extends Bird{
	void Run(){
		System.out.println("Animal is running");
	}
}

public class SingleInh {
public static void main(String args[]){
	Animal d=new Animal();
	d.fly();
	d.Run();
}
}
