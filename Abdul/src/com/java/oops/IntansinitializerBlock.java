package com.java.oops;

class Demo {
	Demo() {
		System.out.println("Parent constructor in invoked");
	}

	{
		System.out.println("IntansinitializerBlock");
	}
}

public class IntansinitializerBlock extends Demo {
	IntansinitializerBlock() {
		super();
		System.out.println("child class constructer");
		{
			System.out.println("IntansinitializerBlock in child");
		}
	}

	public static void main(String[] args) {
		IntansinitializerBlock ob = new IntansinitializerBlock();

	}

}
