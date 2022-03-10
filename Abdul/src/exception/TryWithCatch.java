package exception;


public class TryWithCatch {

	public static void main(String[] args) {
	
		 try {
			  String s=null;
			  s.length();
			try {
				int a=10/0;
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("hello");
			}
			
			}
		 catch (NullPointerException e) {
			// TODO: handle exception
			 System.out.println("yes");
		}
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println("bb");
		}
			
		 }
	 

	}

	
