package com.jsoft.String;

public class StringImmutable {

	public static void main(String[] args) {
		String s="Abdul";
		String s1="Waris";
		s.concat(s1);
		System.out.println(s);//will print Abdul because strings are immutable objects
		
		s=s.concat("Waris");
		System.out.println(s);
//if we explicitely assign it to the reference variable, it will refer to "AbdulWaris" object.For example
		System.out.println("----------------------------------------");

		//Java String compare
		
		String s2="abdul";
		String s3="abdul";
		String s4=new String("abdul");
		String s5="waris";
		System.out.println(s2.equals(s3));//t
		System.out.println(s2.equals(s4));//t
		System.out.println(s2.equals(s5));//f
		
		System.out.println("----------------------------------------");
		
		String s6="Abdul";
		String s7="ABDUL";
		System.out.println(s6.equals(s7));//f
		System.out.println(s6.equalsIgnoreCase(s7));//t
		System.out.println("----------------------------------------");
		
		//String compare by == operator
		System.out.println("----------------------------------------");
		
		String s8="waris";
		String s9="waris";
		String s10=new String("waris");
		System.out.println(s8==s9);//t
		System.out.println(s8==s10);//f
		System.out.println("----------------------------------------");
		
		String s11="abc";
		String s12="abc";
		String s13=new String("AB");
		System.out.println(s11.compareTo(s12));//0
		System.out.println(s11.compareTo(s13));//32
		System.out.println(s11.compareToIgnoreCase(s13));//1
		System.out.println("----------------------------------------");
		
		String s14="Abdul "+ "Waris";
		String s15="Waris";
		System.out.println(s14);
		s14.concat(s15);
		System.out.println(s14.concat(s15));//AbdulWaris
		System.out.println(s14);
		
		System.out.println("----------------------------------------");
		String s16="Abdulwaris";
		System.out.println(s16.substring(5));//waris
		System.out.println(s16.substring(2, 6));//ulwaris
		System.out.println(s16.subSequence(3, 10));//ulwaris
		
		System.out.println("----------------------------------------");
		
		//Java String toUpperCase() and toLowerCase() method
		
		String s17="abdulWaRis";
		System.out.println(s17.toUpperCase());
		System.out.println(s17.toLowerCase());
		System.out.println(s17.trim());
		System.out.println(s17.startsWith("     abd"));
		
		System.out.println(s17.endsWith("sh"));
		System.out.println(s17.charAt(8));
		
		System.out.println(s17.length());
		System.out.println();
		
		System.out.println(s17.replace("abdul", "mohammad"));

		//StringBuffer
		
		StringBuffer s18=new StringBuffer("Abdul waris");
		System.out.println(s18.append(" khan"));
		System.out.println(s18.insert(2, "Hi guys"));//AbHi guysdul waris

		
		StringBuffer s19=new StringBuffer("java programming Language");
		System.out.println(s19.replace(4, 7, "Hi developer"));//javaHi developerogramming Language
		System.out.println(s19.delete(3, 6));//javrogramming Language
		System.out.println(s19.reverse());//egaugnaL gnimmargorp avaj
		
		StringBuffer s20=new StringBuffer("abdulwariskhan");
		s20.append("khan");
		System.out.println(s20.capacity());
		s20.append("anwarul");
		System.out.println(s20.capacity());
		System.out.println(s20.capacity());
		System.out.println(s20.capacity());
		
		
		
		
		
		
		
		
		
		
	}

}
