package com.aggeregation;

public class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.state);
	}

	public static void main(String[] args) {
		System.out.println("Hi");
		Address address = new Address("gzb", "UP", "india");

		Emp e = new Emp(111, "varun", address);

		e.display();

	}
}