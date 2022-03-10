package Demo;
class Learn{
	 void sis() {
		System.out.println("Static running");
	}
	static void simple() {
		System.out.println("Without object not run");
	}
}
public class StaticTest {

	public static void main(String[] args) {
		Learn p=new Learn();
		p.sis();
		Learn.simple();
		

	}

}
