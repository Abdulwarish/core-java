package com.jsoft.String;

public class ReplaceStringBySplit {

	public static void main(String[] args) {
		int e = 0;
		String s = new String("my name! is khan");
		String[] word = s.split("\\s");
		for (int i = word.length - 1; i >= 0; i--) {
			if (i > 1) {
				System.out.print(word[i] + " ");
			}
		}
		for (int i = 0; i <= 1; i++) {
			String c = word[i];
			System.out.print(" " + c);
		}
	}
}
