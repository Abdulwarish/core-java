package com.java.oops;
	class State{
		void UttarPradesh(){
			System.out.println("Uttar pradesh");
		}
	}
	class Country extends State{
		void UttarPradesh() {
			System.out.println("basti in UP");
		}
		void district() {
			System.out.println("sant kabir nagar");
		}
	
	void disp() {
		super.UttarPradesh();
		district();
		
	}
	}
public class SuperOnMethod {

	public static void main(String[] args) {
		Country ob=new Country();
		ob.disp();
	}

}
