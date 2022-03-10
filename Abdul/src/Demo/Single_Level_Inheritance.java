package Demo;

class Sbi{
	void sbi(){
		System.out.println("Sbi Account");
	}
}
	class Hdfc extends Sbi{
		void hdfc(){
			System.out.println("Hadfc bank ");
		}
}
class Single_Level_Inheritance{
	public static void main(String args[]){
		Hdfc object=new Hdfc();
		object.hdfc();
		object.sbi();
	}
}
//Single_Level_Inheritance