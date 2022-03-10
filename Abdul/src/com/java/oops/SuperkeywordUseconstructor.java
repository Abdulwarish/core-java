package com.java.oops;
	class Cloth{
		Cloth(int a){
			System.out.println("Cloth parent class constructor");
		}
	}
	class Cloth2 extends Cloth{
		Cloth2(){
			super(5);
			System.out.println("Coloth2 Constructor");
		}
	
}
public class SuperkeywordUseconstructor {

	public static void main(String[] args) {
		Cloth2 ob=new Cloth2();
	}

}
