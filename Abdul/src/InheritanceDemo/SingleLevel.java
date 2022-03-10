package InheritanceDemo;
class OO{
	void m1() {
		System.out.println("A");
	}
}
public class SingleLevel extends OO{
	void m1() {
		System.out.println("B");
	}
	public static void main(String[] args) {
		SingleLevel s=new SingleLevel();
		s.m1();
	}
}
