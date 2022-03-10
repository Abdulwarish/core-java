package com.java.oops;
class D{
	int id;
	String name;
	String city;
	D(int id,String name,String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}
}
public class AggerigationDemo {
		int id;
		String name;
		String city;
		D d;
		AggerigationDemo(int id,String name,String city,D d){
			this.id=id;
			this.name=name;
			this.city=city;
			this.d=d;
		}
		void disp() {
			System.out.println(id+" "+name+" "+city);
			System.out.println(d.id+" "+d.name+" "+d.city);
		}
	public static void main(String[] args) {
		D d=new D(12,"abc","sakinaka");
		AggerigationDemo ft=new AggerigationDemo(32,"abdul","mumbai",d);
		ft.disp();
		
	}
}
