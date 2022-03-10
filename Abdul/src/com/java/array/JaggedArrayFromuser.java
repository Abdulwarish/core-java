package com.java.array;

import java.util.Scanner;

public class JaggedArrayFromuser {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("Enter numbre for jagged array");
		int arr[][] = new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = d.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();

		}

	}
}
