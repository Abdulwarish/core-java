package exception;

public class TryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("Exception before Occur");
			System.out.println(1/0);
			System.out.println("After Exception occur");//its not Execute
		}
		catch(java.lang.ArithmeticException e) {
			System.out.println("catch Block");
			e.printStackTrace();
			e.getMessage();
		}
		finally {
			System.out.println("Its Always Execute");
		}
	}

}
