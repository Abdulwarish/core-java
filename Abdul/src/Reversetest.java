
public class Reversetest {
	public static void main(String[] args) {
		
	
		int e = 0;
		String s = new String("my name! is khan");
		String[] word = s.split("\\s");
		String sd=word[1];
		for (int i = word.length - 1; i >= 1; i--) {
			e = i;

			if (e > 1) {
				System.out.print(word[i] + " ");
			}
		}
		for (int i = 0; i <= 1; i++) {
			String c = word[i];
			System.out.print(" " + c);

		}
		/*String s="Abdul waris khan bagh nagar";
		String w[]=s.split("\\s");
		for(int i=w.length-1;i>=0;i--) {
			System.out.print(" "+w[i]);
			
		}*/
}
}
