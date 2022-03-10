
public class HowAreu {
	public static void main(String[] args) {
		Student s=new Student("Abc",100);
		Student s2=s;
		System.out.println(s2.hashCode());
		System.out.println(s.hashCode());
		
		
	}
}
