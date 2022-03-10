package callbyvalue;

public class CallByValue {
		int a=400;
		void change(int a) {
			a=a+100;
		}
	public static void main(String[] args) {
		CallByValue op=new CallByValue();
		System.out.println("Before change"+op.a);
			op.change(100);
			System.out.println("After change"+op.a);
	}

}

class F{
	void f(Object a) {
		System.out.println("object");
	}
	void f(String a) {
		System.out.println("string");
	}
	public static void main(String[] args) {
		F a = new F();
		a.f(null);
		
		try {
			
		}finally {
			
		}
	}
	
	
}