package logicalquestion;

import java.util.Scanner;

public class AbcCounting {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  String abc will count how many time putted");
		String s = sc.nextLine();
		for (int i = 0; i < s.length() - 3; i++) {
			if (294 == s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2)) {
				count++;
			}
		}
		System.out.println("Total abc counted = " + count);
	}
}
