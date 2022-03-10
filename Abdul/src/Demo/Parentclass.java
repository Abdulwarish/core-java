package Demo;
interface Parent12{
	void m1();
}
interface Child12{
	void m1();
}
interface MultipleInherit extends Parent12,Child12{
	default void mi(){
		System.out.println("M1 method");
	}
	default void m1() {
		System.out.println("m1 is implemented");
	}
}
public interface Parentclass {
	public static void main(String[] args) {

		Parent12 ob = null;
		ob.m1();
	}
}
