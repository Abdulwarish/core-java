package exception;

class AgeException extends Exception{
	
	AgeException(String msg){
		super(msg);
	}
}
public class custmoziedExceptionCompleteInthisClass {

	public static void main(String[] args) throws AgeException{
		int n = 10;
		if(n<18) {
			throw new AgeException("number is less then 18");
		}
		else
		{
			System.out.println("Number is Greater");
		}
	}

}
