package designpattern;
class SingleDemoLearn{
	static SingleDemoLearn obj=new SingleDemoLearn();
	private SingleDemoLearn(){
		
	}
	static SingleDemoLearn m1() 
	{
		System.out.println("hi by");
		return obj;
		
	}
}
public class SingleDemo {
	public static void main(String[] args) {
	SingleDemoLearn.m1();
	}
}
