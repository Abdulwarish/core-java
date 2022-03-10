package logicalquestion;

import java.util.Scanner;

public class CommanAdd5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		System.out.println("Enter Elements");
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a-1;i++) {
			for(int j=i+1;j<a;j++) {
				if(arr[i]+5==arr[j]) {
					System.out.println(arr[i]+" - "+arr[j]);
				}
			}
		}
		
	}
}

/*
 *  int ar[]= {5,34,10,65,90,45,50,39,15,70};
		 for(int i=0;i<ar.length-1;i++) {
			 for(int j=i+1;j<ar.length;j++) {
				 if(ar[i]+5==ar[j]) {
					 System.out.println(ar[i]+"-"+ar[j]);
				 }
			 }
		 }
		 */
 