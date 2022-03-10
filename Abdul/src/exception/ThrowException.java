package exception;
class CustomeException extends Exception{
	CustomeException(String s){
		super(s);
	}
}
class TestCustomException{  
		
	public static void valid(int age) throws CustomeException{
		if(age<18) {
			throw new CustomeException("invalid");
			}
		else {
			System.out.println("valid");
			}
		}			
}
public class ThrowException {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			TestCustomException.valid(19);
		} catch (CustomeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
