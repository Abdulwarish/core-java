package test;

public class StringReplace {

	public static void main(String[] args) {
		String s1="java string split method by javatpoint";

		String[] words=s1.split(" ");
		for(int i=words.length-1;i>=0;i--){
		System.out.print(words[i]+" ");
		}

	}

}
