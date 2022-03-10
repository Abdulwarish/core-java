package test;

public class PrimeAnother {

	public static void main(String[] args) {
		int no=5;
		int temp=0;
		for(int i=2;i<=no/2;i++){
			if(no%i==0){
				temp=temp+1;
			}
		}
			if(temp==0){
	
				System.out.println("no is prime");
			}
			else{
				System.out.println("no is not prime");
			}


	}
}
