package InterviewProgran;

public class CharCount {

	public static void main(String[] args) {
		String s = "bbbdddwww";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					c++;
				}
			}
			System.out.println(s.charAt(i) + " - " + c);
			String d = String.valueOf(s.charAt(i)).trim();
			s = s.replaceAll(d, "");
			c = 0;
		}
	}

}
