package com.interview;

public class SimpleTest {
	
	public void m1(Object a) {
		System.out.println("Hi");
	}
	public void m1(String a) {
		System.out.println("By");
	}
	public static void main(String[] args) {
		
		SimpleTest obj = new SimpleTest();
		obj.m1(null);
		
	}
}
