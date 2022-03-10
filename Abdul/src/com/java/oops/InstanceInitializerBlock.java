package com.java.oops;

public class InstanceInitializerBlock {
	int speed;

	InstanceInitializerBlock() {
		System.out.println("Constructor is running");
	}

	{
		System.out.println("InstanceInitializer block in run");
	}
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		System.out.println("I am abdul waris sorry sir ");
		InstanceInitializerBlock ob = new InstanceInitializerBlock();

	}

}
