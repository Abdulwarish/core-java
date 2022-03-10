package InterviewProgran;

public interface D extends A,B,C {

}
interface A{
	public void m1();
	public void m2();
}
interface B{
	public void m1();
	public void m2();
}
interface C{
	public void m1();
	public void m2();
}
class E implements D{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}