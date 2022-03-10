package com.java.array;

public class WrapperClassBoxing {

	public static void main(String[] args) {
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j); 
		//-----------------------------
		
		//Converting Integer to int    
		Integer c=new Integer(3);    
		int i1=c.intValue();//converting Integer to int  
		int j1=c;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(c+" "+i1+" "+j1);   
	}

}
