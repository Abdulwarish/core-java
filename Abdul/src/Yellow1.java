
public class Yellow1{
	String n;
	public Yellow1(String name) {
		n=name;
	}
public static void main(String args[]) {
	Yellow1 b=new Yellow1("jay");
	Yellow1 b1=new Yellow1("jay");
	System.out.println(b==b1);
	System.out.println(b.equals(b1));
}
}
