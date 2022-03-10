package test;

public class Tostring {
	int roll;
	String name;
	String addres;
	public Tostring(int roll,String name,String adderes){
		this.roll=roll;
		this.name=name;
		this.addres=adderes;
	}
	public String toString(){
	int adderes=1;
		return roll+" "+name+" "+adderes;
	}
	public static void main(String args[]){
		Tostring s1=new Tostring(1,"abdul","baghnagar");
		Tostring s2=new Tostring(2,"abdul Rasheed","Chorha");
		System.out.println(s1);
		System.out.println(s2);
	}
}
