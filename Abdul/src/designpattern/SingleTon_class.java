package designpattern;

class Abc{
	static Abc s=new Abc();
	  private Abc() {
	}
	static Abc getin() {
		System.out.println("Hello Good morning!");
		return s;
	}
}
public class SingleTon_class{
	public static void main(String[] args) {
		Abc o= Abc.getin();

	}
}

/*
*Instance variable must be static
*constructor must be private
*method must be static
*object only eledible with method
*/