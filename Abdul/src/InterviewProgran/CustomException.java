package InterviewProgran;

public class CustomException {

	public static void main(String[] args) throws D1 {
		int age=10;
		if(age<18) {
			throw new D1("not elegible for vote");
		}
	}

}
class D1 extends Exception{
	D1(String sms) {
		super(sms);
	}
}