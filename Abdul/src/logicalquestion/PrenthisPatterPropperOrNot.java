package logicalquestion;

import java.util.Scanner;

public class PrenthisPatterPropperOrNot {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String  pattern");
		String s=sc.nextLine();
			for(int j=0;j<s.length();j++) {
				if(40==s.charAt(j)) {
					count++;
				}
			}
		
		if(count==s.length()/2) {
			System.out.println("Perfect pattern");
		}
		else {
			System.out.println("Not perfecrt pattern");
		}
	}

}
