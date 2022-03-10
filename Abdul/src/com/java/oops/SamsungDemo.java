package com.java.oops;

interface Samsung1{
	void j7();
}
class Nokia1 implements Samsung1{
	public void j7() {
		System.out.println("Samsung j7 has been sell");
	}
}
class SamsungDemo{
	public static void main(String[] args) {
		Nokia1 ob=new Nokia1();
		ob.j7();
	}
}