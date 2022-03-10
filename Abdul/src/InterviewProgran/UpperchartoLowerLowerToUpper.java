package InterviewProgran;

public class UpperchartoLowerLowerToUpper {

	public static void main(String[] args) {
		String str1="ABDUl waRis";
		StringBuilder str=new StringBuilder(str1); 
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i))){
				str.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(str);

	}

}
