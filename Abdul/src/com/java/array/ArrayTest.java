package com.java.array;
public class ArrayTest {

	public static void main(String[] args) {
		int ar[]=new int[10];
		int b=0;
		ar[0]=100;
		ar[1]=100;
		ar[2]=100;
		ar[3]=100;
		ar[4]=100;
		ar[5]=100;
		ar[6]=100;
		ar[7]=100;
		ar[8]=100;
		ar[9]=100;
		//ar[10]=130;
		for(int num : ar) {
			b=b+num;
		}
System.out.println("Total No is "+b);

	for(int i=0;i<=ar.length-1;i++) {
		System.out.println("Length "+i+":"+ar[i]);
	}
	}

}
