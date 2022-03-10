package test;

public class Const_over {
	int id;
	String name;

	Const_over(){
		System.out.println("default constructor");
	}
	Const_over(int id, String name) {
		this.id = id;
		this.name = name;
	}
public void display(){
	System.out.println(" id = "+id+"  name = "+name+"");
}
	

	public static void main(String[] args) {
		Const_over const_over = new Const_over();
		Const_over over = new Const_over(101, "Abdul waris");
		over.display();

	}

}
