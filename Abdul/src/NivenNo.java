import java.util.Scanner;

public class NivenNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=sc.nextInt();
		int res=0,rem,hold=no;
		while(no>0) {
			rem=no%10;
			res=res+rem;
			no=no/10;
		}
		if(hold%res==0) {
			System.out.println("Niven number");
		}
		else {
			System.out.println("Not niven number");
		}
	}

}
