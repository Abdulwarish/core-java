package test;

public class MethodOverriding {
	void run(){
		System.out.println("hi");
	}
	class MethodOverriding1 extends MethodOverriding{
		void run(){
			System.out.println("hello");
		}
		public  void main (String args[]){
			MethodOverriding obj=new MethodOverriding();
			obj.run();
		} 
	}

}
