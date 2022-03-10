package com.java.oops;
	class Methodchk{
		final void run() {
			System.out.println("Parent method is invoked");
		}
	}
public class Finalmethod extends Methodchk {
		/*void run() {	we can't override after final used in parent method
			System.out.println("Child method");
		}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
