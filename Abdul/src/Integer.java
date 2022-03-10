 
class Clintest implements Cloneable{
	int id;
	String name;
	Clintest(int id,String name){
		this.id=id;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Integer  {
	public static void main(String[] args) {
		Clintest obj=new Clintest(10, "Waris");
		try {
			Clintest obj1=(Clintest)obj.clone();
			System.out.println(obj+" "+obj1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
	}
}
