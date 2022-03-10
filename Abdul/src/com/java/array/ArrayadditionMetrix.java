package com.java.array;

class ArrayadditionMetrix 
{
	public static void main(String[] args) 
	{
		int a1[][]={{1,2,3},{4,5,6}};
		int b1[][]={{1,2,3},{3,5,7}};
		int c1[][]=new int[2][4];

		for(int i=0;i<2;i++){
				for(int j=0;j<3;j++)
				{
					c1[i][j]=a1[i][j]+b1[i][j];
					System.out.print(c1[i][j]+" ");
				}
				System.out.println();
			}

	}
}
