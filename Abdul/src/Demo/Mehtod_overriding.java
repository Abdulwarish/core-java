package Demo;
//It is method overriding
class Methodoverriding{
	int bike(int a,int b) {
		return a+b;
	}
}
public class Mehtod_overriding extends Methodoverriding {
	void bike() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Mehtod_overriding ob=new Mehtod_overriding();
		ob.bike();
		
		
	}

}
