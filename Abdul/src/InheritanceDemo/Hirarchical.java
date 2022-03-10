package InheritanceDemo;
class OO3{
	void m1() {
		System.out.println("A");
	}
}
class OO4 extends OO3{
	void m1() {
		System.out.println("B");
	}
}
public class Hirarchical extends OO3{
	void m1() {
		System.out.println("C");
	}
	public static void main(String[] args) {
		Hirarchical h=new Hirarchical();
		h.m1();
	}

}
