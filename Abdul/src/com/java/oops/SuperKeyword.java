package com.java.oops;


class Colors {
	String green = "Green color Parent";
	  public void display() {
		   System.out.println("Colour.display() parent");
	   }
	 }
class Colour extends Colors {
	String green ="Green Color child class ";
   public void display() {
	   System.out.println("Colour.display()");
   }
   
	void disp() {
		//System.out.println(super.green);
		super.display();
		
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Colour ob=new Colour();
		ob.disp();
	}

}
