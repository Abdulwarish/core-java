package test;
class A1{
	int id;
	String name;
	public A1(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
class B{
	A1 a1;
	String city;
	B(String city,A1 a1){
		this.a1=a1;
		this.city=city;
	}
	void dis() {
		System.out.println(city);
		System.out.println(a1.id+" "+a1.name);
		
	}
}
class Aggerigation{
	public static void main(String[] args) {
		A1 on=new A1(12,"waris");
		B o=new B("mumbai",on);
		o.dis();
	}
}


/*
class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
class Aggerigation {
	int id;
	String name;
	Address address;

	public Aggerigation(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("gzb", "UP", "india");
		Address address2 = new Address("gno", "UP", "india");

		Aggerigation e = new Aggerigation(111, "varun", address1);
		Aggerigation e2 = new Aggerigation(112, "arun", address2);

		e.display();
		e2.display();

	}
}*/