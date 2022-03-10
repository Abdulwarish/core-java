package test;

public class Primecheck {

	public static void main(String[] args) {
		int no=19,c=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				c++;
			}
		}
		if(c==0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not prim no");
		}
		

	}

}
