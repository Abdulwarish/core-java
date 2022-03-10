package program_2021;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 153,res=0,temp,rem;
		temp=x;
		while(x>0) {
			rem = x%10;
			res=res*10+rem;
			x=x/10;
		}
		if(res==temp) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
	}

}
