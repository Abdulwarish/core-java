package com.java.oops;

public class construvtorParamet {
	int a, b;
	static int c;

	construvtorParamet(int a, int b) {
		this.a = a;
		this.b = b;
		this.c = c;
		c = a * b;
	}

	 void disp() {
		System.out.println("Total is=" + c);
	}

	public static void main(String[] args) {
		construvtorParamet ob = new construvtorParamet(10, 40);
		ob.disp();
	}
}
