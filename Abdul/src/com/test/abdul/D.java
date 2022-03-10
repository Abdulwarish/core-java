package com.test.abdul;

class A{
	int b=10;
}
class B extends A{
	int b=20;
}
class D{
	public static void main(String[] args) {
		A ob=new B();
		System.out.println(ob.b);
	}
}