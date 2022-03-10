package programimportant;

public class NivenNumberDemo {
	public static void main(String[] args){
		int res=0,rem,no=21;
		int ch=no;
		while(no>0) {
			rem=no%10;
			res=res+rem;
			no=no/10;
		}
		if(ch%res==0) {
			System.out.println("Niven  number");
		}else {
			System.out.println("Not niven");
		}
	}

}
