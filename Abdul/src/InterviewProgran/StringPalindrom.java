package InterviewProgran;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		if(s1.equals(s)) {
			System.out.println("Palindrom String");
		}
		else {
			System.out.println("Not palindrom Stiring");
		}
	}

}
