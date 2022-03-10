package com.jsoft.String;

final public class Immutable_class_creating{
	
	public static void main(String[] args){
		Immutable s = new Immutable(10, "ABDUL WARIS");//object become immutable
		System.out.print(s.getId() + " " + s.getName());
		
		
		/*
		 * class must be public and final
		 * data member are private and final
		 * Provide initialization only throw constructor at the time of object creation
		 * Only getter method are  Allow not Setter method
		 */
		
		
		/*
		 * if data member is private u can't make setter Method
		 * if data member is final u can't Accessible to other class
		 */
	}
}
