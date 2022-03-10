package Demo;

class Lucknow{
	void lko(){
		System.out.println("Lucknow");
	}
}
class Basti extends Lucknow{
	void baghnagar(){
		System.out.println("Basti");
	}
}
class Santkabir_nagar extends Lucknow{
	void santkabir(){
		System.out.println("Santkabir_nagar");
	}
}
class Hirarchical_Inheritance{
public static void main(String args[]){
Santkabir_nagar ob=new Santkabir_nagar();
ob.lko();
//ob.baghnagar();
ob.santkabir();
}
}
//Hirarchical_Inheritance