package com.java.oops;


	class Overrid extends Method_Ovrriding{
	public	void m1() {
			System.out.println("Hello");
		}
}
	public class Method_Ovrriding {
		public void m1() {
			System.out.println("Hi");
		}
		public static void main(String[] args) {
			Overrid ob=new Overrid();
			ob.m1();
			
		}
	}
