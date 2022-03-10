package com.java.oops;
	abstract class Samsung{
		abstract void j7();
		abstract void j5();
		abstract void j2();
	}
	 class Nokia extends Samsung{
		void j7() {
			System.out.println("J7 is launched");
		}
		void j5() {
			System.out.println("J5 is launched");
		}
		void j2() {
			System.out.println("j2 is launched");
		}
	}
public class AbstractDemo{
	public static void main(String[] args) {
		Samsung ob=new Nokia(); 
		ob.j7();
		ob.j5();
		ob.j2();
	}
	
}
