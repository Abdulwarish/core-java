package com.jsoft.String;
class Test{
	public void m1(int a){
	System.out.println("No Argument");
	}
	public void m1(int ...a){
		System.out.println("Argument");
		}
	
	public void m1(int i,float a){
	System.out.println("Hello g");
	}
	public void m1(float i,int a){
		System.out.println("hi ");
	}
}
public class Overlloding{
	public static void main(String args[]){
		Test t=new Test();
		t.m1();
		//t.m1(10,10);
		t.m1(10,34.9f);
		t.m1(20.5f,56);
		t.m1('a'); 
		//t.m1(10,10);
		//t.m1(10.5f);
}
	} 