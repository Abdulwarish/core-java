package Demo;

public class Exception2 {

	public static void main(String[] args) {
		try
		{
			int arr[]=new int[5];
			arr[5]=100;
			System.out.println("Exception not found");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println(e);
		}
//		System.out.println("Rest of the code");
	}

}
