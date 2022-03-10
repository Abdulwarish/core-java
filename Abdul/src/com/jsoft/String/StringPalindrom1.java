package com.jsoft.String;

import javax.imageio.IIOException;

public class StringPalindrom1 {
	static void Custmized(int age) throws Exception {
		if(age<18) {
			throw new Exception("Not valid");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		try {
			Custmized(13);
		}catch(Exception as) {
			System.out.println("Exception get"+as);
		}
	}
}
