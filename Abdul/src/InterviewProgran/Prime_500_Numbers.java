package InterviewProgran;

public class Prime_500_Numbers {

	public static void main(String[] args) {
		for(int j=1;j<=500;j++) {
			int no=j;
			int c=0;
	
		
		for(int i=2;i<=no/2;i++) {
			if(no%i==0) {
				c++;
			}
		}
		if(c==0) {
			System.out.println("Prime > "+no);
		}
		
		}
	}

}
