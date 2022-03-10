package withouToString;

public class Student {
	int roll;
	String name;
	String city;
	
	Student(int roll,String name,String city){
		this.roll=roll;
		this.name=name;
		this.city=city;
	}
	public static void main(String[] args) {
		Student s1=new Student(10,"waris","basti");
		Student s2=new Student(11,"Abdul waris","sant kabir nagar");
		System.out.println(s1);//Student@15db9742
		System.out.println(s2);//Student@6d06d69c  compiler writes here s1.toString()
	}
}
