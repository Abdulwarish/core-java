package logicalquestion;

import java.util.Scanner;

public class BubleShortFrUsr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int b1=sc.nextInt();
		int ar[]=new int[b1];
		System.out.println("Enter Elements");
		for(int k=0;k<ar.length;k++) {
			ar[k]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(ar[j]>ar[i]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=ar[i]; 
				}
			}
		}
		for(int itr=0;itr<=ar.length;itr++) {
			System.out.println("Shorting is = "+ar[itr]);
		}
	}
}
