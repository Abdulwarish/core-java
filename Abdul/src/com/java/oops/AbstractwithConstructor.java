package com.java.oops;
	abstract class SBI{
		SBI(){
			System.out.println("State bank of india");
		}
		abstract void withdraw();
		void deposit() {
			System.out.println("Deposited");
		}
	}
	class PNB extends SBI{
		void withdraw() {
			System.out.println("state bank withdraw");
		}
	}
public class AbstractwithConstructor {

	public static void main(String[] args) {
		SBI ob=new PNB();
		ob.deposit();
		ob.withdraw();
	

	}

}
