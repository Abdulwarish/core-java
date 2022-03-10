package com.java.oops;
	abstract class Jsoft{
		abstract void employee();
	}
	class Ibm extends Jsoft{
		 void employee() {
			System.out.println("Jsoft employees");
		}
	}
		class Tcs extends Jsoft{
			void employee() {
				System.out.println("Tcs employees");
			}
		}
public class Abstractqnother {
	public static void main(String[] args) {
		Jsoft ob=new Tcs();
		ob.employee();
	}
}
