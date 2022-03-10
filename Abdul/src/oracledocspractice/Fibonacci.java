
package oracledocspractice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String args[]) {
		int f,f1=0,f2=1,no=5;
		System.out.print(f1+" "+f2);
		while(no>0) {
			f=f1;
			f1=f2;
			f2=f+f2;
			System.out.print(" "+f2);
			
			no--;
		}
		
	}

}
