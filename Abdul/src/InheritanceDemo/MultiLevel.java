package InheritanceDemo;
class OO1{
	void m1() {
		System.out.println("A");
	}
}
class OO2 extends OO1{
	void m1() {
		System.out.println("B");
	}
}
public class MultiLevel extends OO2{
	void m1() {
		System.out.println("C");
	}
	public static void main(String[] args) {
		MultiLevel m=new MultiLevel();
		m.m1();
	}

}
