package com.java.array;

public class MultiDiamensionalArray {

	public static void main(String[] args) {
		int arr[][]= {{10,23,45},{12,23,34},{21,21,12}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
