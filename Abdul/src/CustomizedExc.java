
class DemoCusetomAgeException extends Exception{
	DemoCusetomAgeException(String msg){
		super(msg);
}
}
public class CustomizedExc{
	public static void main(String[] args) {
		int no=10;
		if(no<18) {
			try {
				throw new DemoCusetomAgeException("Number is less");
			} catch (DemoCusetomAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else {
			System.out.println("no greter");
		}
		
	}
}
