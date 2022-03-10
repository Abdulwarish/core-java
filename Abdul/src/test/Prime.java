package test;

public class Prime {

	public static void main(String[] args) {
		int n=14,c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				c++;
			}
			
		}
		if(c==0){
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime number");
		}

	}

}
