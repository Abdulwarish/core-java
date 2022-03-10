package Demo;


class Axis{
	void axis(){
		System.out.println("Axis bank");
	}
}
	class Union extends Axis{
		void unio(){
			System.out.println("Union bank");
		}
	}
	class Punjab extends Union{
		void punb(){
			System.out.println("Punjab bank");
		}
	}
class Multilevel_Inheritance{
	public static void main(String args[]){
		Punjab ob=new Punjab();
		ob.axis();
		ob.unio();
		ob.punb();
	}
}
//Multilevel_Inheritance