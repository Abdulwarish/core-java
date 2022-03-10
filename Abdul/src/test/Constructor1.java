package test;

public class Constructor1 {
	int a=10;
	int b=50;
	int c=0;
	int c1,b1;
	Constructor1(){
		System.out.println("Default Constructor");
	}
	void disp(){
		c=a+b;
		System.out.println("a="+a+"b="+b);
		System.out.println(c);
	}
	public static void main(String args[]){
		Constructor1 con=new Constructor1();
		con.disp();
		
	}
}
