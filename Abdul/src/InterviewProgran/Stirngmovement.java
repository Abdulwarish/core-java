package InterviewProgran;

public class Stirngmovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abdul waris khan";
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+" ");
		}
	}

}
