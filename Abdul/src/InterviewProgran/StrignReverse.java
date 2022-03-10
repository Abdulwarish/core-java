package InterviewProgran;

public class StrignReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "AbdulWarish";
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			reverse = reverse+ch;
		}
		System.out.println(reverse);

	}

}
