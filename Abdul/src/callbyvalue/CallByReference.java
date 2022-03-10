package callbyvalue;

public class CallByReference {
		int data=100;
		void cet(CallByReference op) {
			op.data=op.data+100;
		}
	public static void main(String[] args) {
		CallByReference op=new CallByReference();
		System.out.println("Before change"+op.data);
		op.cet(op);
		System.out.println("After change"+op.data);

	}

}
