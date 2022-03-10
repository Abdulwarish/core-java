package com.java.array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {

		int ar[][]= {
				{1,2,4},
				{2,3,4,5},
				{4,6,7}
				};
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
			
	}

}
