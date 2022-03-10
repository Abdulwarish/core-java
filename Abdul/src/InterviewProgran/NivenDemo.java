package InterviewProgran;

public class NivenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0,rem,no=120,c=no;
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
