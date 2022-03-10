package com.java.array;
	

public class ArrayTest1 {
			
	
	static int[] see() {
		return new int[]{12,12,12,12,12};
		
	}
	
	/*static void add(int arr[]) {
					for(int i=0;i<=arr.length-1;i++) {
						System.out.println(arr[i]);
					}
				}*/
	public static void main(String[] args) {
		int arr[]=see();
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		//add(new int[]{12,23,45,56,78});
		/*int arr[]={12,34,45,56,45,34};
		add(arr);*/
		
		
		
		
		/*int arr[]= {10,23,34,65,43,21};
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println(sum);*/
		
		
		/*int arr[]= {10,23,33,56,78};
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}*/
		
		
		
		/*int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}*/

	}

}
