package Demo;
	abstract class Abdul{
		abstract void A();
		abstract void B();
		abstract void C();
		}
	class D extends Abdul{
		void A() {
			System.out.println("A is ssuccesfully Run")
			;
		}
		void B() {
			System.out.println("B is ssuccesfully Run");
		}
		void C() {
			System.out.println("C is ssuccesfully Run");
		}
	}
		
public class Abstract1 {

	public static void main(String[] args) {
		D o=new D();
		o.A();
		o.B();
		o.C();
	}

}