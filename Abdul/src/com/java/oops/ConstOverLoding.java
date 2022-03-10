package com.java.oops;

public class ConstOverLoding {
	int id;
	String name;
	float balance;
	ConstOverLoding(int i,String n,float f){
		this.id=i;
		this.name=n;
		this.balance=f;
		System.out.println(id+"First"+name+""+balance);
	}
	ConstOverLoding(){
		System.out.println("Default constructor");
	}
	ConstOverLoding(int a,String b,int c){
		this.id=a;
		this.name=b;
		this.balance=c;
		System.out.println(id+" "+name+" "+balance);
	}
	public static void main(String[] args) {
		ConstOverLoding obj=new ConstOverLoding(10,"waris",5000.0f);
		ConstOverLoding obj1=new ConstOverLoding(11,"Abdul waris",6000);
		ConstOverLoding obj2=new ConstOverLoding();
		
	}
	
}
