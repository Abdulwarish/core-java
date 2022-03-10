package Demo;
	class Demo12{
		void bike() {
			System.out.println("Bike is running");
		}
		void add(int a,int b) {
				int c=a+b;		
		}
		
	}
public class TestA extends Demo12 {
	void bike(int a,int b) {
		System.out.println("Bike is not running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA ob=new TestA();
		ob.bike();
		ob.bike(1,723232232);
		
	}

}
