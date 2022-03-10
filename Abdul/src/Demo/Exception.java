package Demo;

public class Exception {

	public static void main(String[] args) {
		try
		{
			int check=10/0;
		}
		catch(ArithmeticException e)
		{
		System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
