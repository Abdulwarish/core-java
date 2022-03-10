import java.util.Scanner;

public class Demotest {

	public static void main(String[] args) {
		int count1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pattern You want to check is propper or not");
		String s=sc.nextLine();
		for(int i=0;i<=s.length()-3;i++) {
			if(294==s.charAt(i)+s.charAt(i+1)+s.charAt(i+2)) {
			count1++;
			}
		}
			System.out.println("Counting Total abc is = "+count1);
	}
}
