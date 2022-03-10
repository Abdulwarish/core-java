package com.jsoft.String;

public class HashCodeTest {

	public static void main(String[] args) {
		String s1=new String("a");
		String s2=new String("a");
		String s3=new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(System.identityHashCode(s1));
		String str="abc";
		System.out.println(str.hashCode());
		String str1="abdul";
		String str2="abdul";
		String str3=new String("waris");
		System.out.println(str2.equals(str1));//false
		System.out.println();
		//str3=s3.intern();
		//System.out.println(str3);
	}

}
class Example{
	int g;
	public Example(int g) {
		this.g=g;
	}
}