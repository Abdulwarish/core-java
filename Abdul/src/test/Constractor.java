package test;



public class Constractor {
	
	int a=10;
	int b=20;
	int c;
	Constractor(){
		System.out.println("Hi");
	}
	Constractor(int a,int b){
		this.a=10;
		this.b=20;
	}
	void disp(){
		System.out.println("a="+a+"b="+b);
		c=a+b;
		System.out.println(c);
		
	}
	public static void main(String args[]){
	

		Constractor obj = new Constractor();
		obj.disp();
	}
}
