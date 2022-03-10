package Demo;
	interface A12{
	 void D();
	 void B();
	 void C();
		}
 class Waris implements A12{
	public void D() {
			System.out.println("A Is successfully Run");
		}
	public	void B() {
			System.out.println("B Is Successfully Run");
		}
	public	void C() {
		System.out.println("C Is Successfully run");
	}
	}
public class Interface {

	public static void main(String[] args) {
		Waris o=new Waris();
		o.C();
		o.B();
		o.D();

	}

}
