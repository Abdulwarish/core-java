package Demo;
	class Student{
		int Emp_Id;
		String Emp_Name;
	}
 class A {
	public static void main(String[] args) {
	
		Student ob=new Student();	 
		ob.Emp_Id=465;
		ob.Emp_Name="Abu huraira";
		System.out.println(ob.Emp_Id+""+ob.Emp_Name);
	}
}
