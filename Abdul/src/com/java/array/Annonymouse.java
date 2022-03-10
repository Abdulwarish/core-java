package com.java.array;

public class Annonymouse {
		static void print(int arr[]) {
			for(int i=0;i<=arr.length-1;i++) {
				System.out.println(arr[i]);
			}
		}
	public static void main(String[] args) {
		print(new int[]{10,12,23,34,45});
	}
}
