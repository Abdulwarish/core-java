package InterviewProgran;

public class Armstron_Number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,res=0,no=121,c=no;
		while(no>0) {
			rem=no%10;
			res=res+rem*rem*rem;
			no=no/10;
		}
		if(c==res)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}

}
