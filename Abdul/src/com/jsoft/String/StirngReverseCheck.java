package com.jsoft.String;

import java.util.Scanner;

public class StirngReverseCheck {

	public static void main(String[] args) {
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev+=ch;
		}
		System.out.println(rev);
	}

}
