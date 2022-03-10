import java.util.HashMap;
import java.util.Map;

interface Abc{
	void m1();
	void m2();
	void m3();
	void m4();
}
public class Test implements Abc{
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		t.m2();
		t.m3();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Hello abdul");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Hello waris");
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
}
