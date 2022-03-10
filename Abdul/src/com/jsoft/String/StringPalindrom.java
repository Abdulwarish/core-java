package com.jsoft.String;
class StinrgPalin{
	StinrgPalin(){
	
		System.out.println("A");
	}
	StinrgPalin(int a){
		
		System.out.println("obaid");
	}
}
class StringPalin1 extends StinrgPalin {
	StringPalin1(){
		System.out.println("B");
	}
	StringPalin1(int a){
	super(4);
		System.out.println("waris");
	}
}
public class StringPalindrom {

	public static void main(String[] args) {
		StringPalin1 ob=new StringPalin1();
		StringPalin1 ob1=new StringPalin1(1);
		
		

	}

}
