package com.java.array;

public class ArrayReturning {
		static int[]get() {
			return new int[]{10,39,34,45,56,67};
			
		}
	public static void main(String[] args) {
		int arr[]=get();
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}

	}

}
