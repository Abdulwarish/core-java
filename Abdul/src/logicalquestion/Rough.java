package logicalquestion;

import java.util.Scanner;

public class Rough {

	public static void main(String[] args) {
		int res=0,rem,no=17,c=no;
		while(no>0) {
			rem=no%10;
			res=res+rem;
			no=no/10;
		}
		if(c%res==0) {
			System.out.println("nive number");
		}
		else {
			System.out.println("n");
		}
		
	}
}
