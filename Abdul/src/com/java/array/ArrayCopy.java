package com.java.array;

public class ArrayCopy {

	public static void main(String[] args) {
		char[] copyfrom= {'a','b','d','u','l','w','a','r','i','s','k','h','a','n'};
		char[] tocopy=new char[10];
		System.arraycopy(copyfrom, 5, tocopy, 1, 5);
		System.out.println(String.valueOf(tocopy));//waris
	}

}
//366712642