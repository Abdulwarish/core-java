package toString;

import java.util.StringTokenizer;

public class Student {
	int roll;
	String name;
	String city;
	
	Student(int roll,String name,String city){
		this.roll=roll;
		this.name=name;
		this.city=city;
	}
	public String toString() {
		return roll+" "+name+" "+"city";
		
	}
	public static void main(String[] args) {
		Student s1=new Student(10,"Suraj","sakinaka");
		Student s2=new Student(11,"Waris","Mumbai sakinaka");
		System.out.println(s1);
		System.out.println(s2);
	}
	
}
