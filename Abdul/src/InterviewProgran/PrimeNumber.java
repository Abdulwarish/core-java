package InterviewProgran;

public class PrimeNumber {

	public static void main(String[] args) {
		int no=13,count=1;
		for(int i=2;i<=no/2;i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}

}
