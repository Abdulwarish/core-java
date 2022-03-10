package com.aggeregation;

class Circle{
	Operation xyz;
	double pi = 3.14;

	void area(int radius,Circle op) {
		xyz = new Operation();
		System.out.println(xyz.name);
	}

	public static void main(String args[]) {
		Circle op = new Circle();
		op.area(5,op);
	}
}