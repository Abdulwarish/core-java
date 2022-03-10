package com.java.oops;
abstract class AbstImp{
	abstract void run();
}
public class Abst extends AbstImp{
	void run(){
		System.out.println("Hello Abstract implemented");
	}
	public static void main(String[] args) {
		Abst ob=new Abst();
		ob.run();
	}
}
