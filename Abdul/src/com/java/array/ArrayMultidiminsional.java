package com.java.array;

public class ArrayMultidiminsional {

	public static void main(String[] args) {
		
			int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr.length-1;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}

}
