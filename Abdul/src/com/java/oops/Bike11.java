package com.java.oops;

 class Bike11{  
	 synchronized int cube(final int n){  
	   //n=n*5;//can't be changed as n is final  
	   System.out.println(n);
	  return n*n*n;  
	  }  
	  public static void main(String args[]){  
	    Bike11 b=new Bike11();  
	    b.cube(10);  
	 } 
	}  
