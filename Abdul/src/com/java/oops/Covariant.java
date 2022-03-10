package com.java.oops;
	
	class B1{
		B1 get() {
			return this;
		}
	}
public class Covariant extends B1{
	Covariant get() {
		return this;
	}
	void mess() {
		System.out.println("Covariant return type");
	}
		public static void main(String[] args) {
		new Covariant().get().mess();

	}

}
