class PalindromNumber {
	public static void main(String arg[]) {
		int rem,res=0,no=15121513;
		int c=no;
		while(no>0){
			rem=no%10;
			res=res*10+rem;
			no=no/10;
		}
		if(res==c) {
			System.out.println("Palindrom Number");
		}
		else 
		{
		System.out.println("Not Palindrom Number");	
		}
	}
}