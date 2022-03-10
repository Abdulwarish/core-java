package InterviewProgran;

import java.util.Scanner;

public class PatternPropperOrNot {

	public static void main(String[] args) {
		int coun=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(40==s.charAt(i)) {
				coun++;
			}
		}
		if(coun==s.length()/2) {
			System.out.println("Perfect Pattern");
		}
		else {
			System.out.println("Pattern Not Perfect");
		}
	}

}
