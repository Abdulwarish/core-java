package com.jsoft.String;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String s=scan.nextLine();
		String s_=scan.nextLine();
		
		String s1=s.toUpperCase();
		System.out.println("String is upper case : "+s1);
		
		int s2=s.length();
		System.out.println("total length is : "+s2);
		
		String s3=s.concat(s_);
		System.out.println("after concat is : "+s3);
		
		char c[]= {'a','e','i','o','u'};
		for(char vowels:c) {
			System.out.println(vowels);
		}

	}

}
