package com.java.oops;
	class Test{
		int roll;
		String name;
		
		Test(int roll,String name){
			System.out.println("Test.Test()");
			this.roll=roll;
			this.name=name;
		}
	}
	class Student extends Test{
		float salary;
		Student(int roll,String name,float salary){
			super(roll,name);	
			this.salary=salary;
		}
		void disp() {
			System.out.println("Roll="+roll+"Name"+name);
		}
	}
public class SuperConstructor {
		public static void main(String[] args) {
			Student ob=new Student(23,"Abdul waris khan",45.5f);
			ob.disp();

	}

}
