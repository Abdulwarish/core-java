package com.jsoft.String;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("abc");
		StringBuffer str1=new StringBuffer("abc");
		
		System.out.println(str.equals(str1));//f
		System.out.println(str==str1);

	}

}
