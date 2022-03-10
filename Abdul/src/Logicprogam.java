import java.util.Scanner;

/*
 * 	Enter elements
	10
	enter Number
	10
	10 13,11 14,12 15,13 16,14 17,
 */
public class Logicprogam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Elements");
		int n=sc.nextInt();
		System.out.println("Enter Number you want");
		int n1=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(i%2==1) {
				System.out.print(n1+++" ");
			}
			else {
				if(n1==10) {
					System.out.print(n1+2);
				}
				else {
					System.out.print((n1+2)+",");
				}
			}
		}
	}

}
