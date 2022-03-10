package com.java.oops;
	class Varialbe{
		int a=10;
		String s="Abdul waris";
	}
	class Check extends Varialbe{
		int a=10;
		String s="Waris khan";
		void print() {
			System.out.println(s);
			System.out.println(super.s);
		}
	}
public class SuperVariable {

	public static void main(String[] args) {
		Check ob=new Check();
		ob.print();;
	}

}
