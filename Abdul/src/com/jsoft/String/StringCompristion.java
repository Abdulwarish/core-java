package com.jsoft.String;

public class StringCompristion {
public static void main(String[] args) {
	String s1="a";
	String s2="a";
	String s3=new String("a");
	StringBuffer s4=new StringBuffer("a");
	StringBuilder s5=new StringBuilder("a");
	
	System.out.println(s1.equals(s1));//true
	System.out.println(s1==s2);//true
	System.out.println(s1.compareTo(s2));//0
	System.out.println(s3.contentEquals(s4));//true
	System.out.println(s3.contentEquals(s5));//true
	
	System.out.println(s2==s3);
}
}
