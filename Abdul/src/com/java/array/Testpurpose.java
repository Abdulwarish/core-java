package com.java.array;

class ArrayMetrix{
public static void main(String [] args){
	int arr[][]={{1,2,3},{3,2,1}};
	int arr1[][]={{2,4,5},{1,2,3}};
	int arr2[][]=new int[2][3];
	for(int i=0;i<2;i++){
		
		for(int j=0;j<3;j++){
			arr2[i][j]=arr[i][j]+arr1[i][j];
			System.out.print(arr2[i][j]+" ");
		}
		
		System.out.println();
	}
	
	
}

}