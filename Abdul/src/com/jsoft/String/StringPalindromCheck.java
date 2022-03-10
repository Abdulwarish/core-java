package com.jsoft.String;

import java.util.Scanner;

public class StringPalindromCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			reverse+=ch;
		}
		if(reverse.equals(s)) {
			System.out.println("String is Palindrom");
		}
		else {
			
			System.out.println("String is not Palindrom");
		}
	}

}
