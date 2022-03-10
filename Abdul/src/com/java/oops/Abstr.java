package com.java.oops;
	abstract class Fruits{
		abstract void apple();
		abstract void mango();
		abstract void bana();
		abstract void papaya();
	}
	class ImpleApple extends Fruits{
		void apple() {
			System.out.println("here is apple");
		}
		void mango() {
			System.out.println("here is mango");
		}
		void bana() {
			System.out.println("here is bana");
		}
		void papaya() {
			System.out.println("here is papaya");
		}
		
	}
public class Abstr {

	public static void main(String[] args) {
		Fruits ob=new ImpleApple();
		ob.apple();
		ob.mango();
		ob.bana();
		ob.papaya();

	}

}
