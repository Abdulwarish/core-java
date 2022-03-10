package com.java.oops;
	interface Seates{
		void passenger();
	}
	class Hjj implements Seates{
	public void passenger() {
			System.out.println("GO for hajj insha allah");
		}
	}
public class Airoplane {
	public void passenger() {
		System.out.println("Hi Subh yatra");
	}
	public static void main(String[] args) {
		Airoplane ob=new Airoplane();
		ob.passenger();
		Hjj ob1=new Hjj();
		ob1.passenger();
		int a=87;
		int b=a>>>5;
		System.out.println(b);
	}
}
