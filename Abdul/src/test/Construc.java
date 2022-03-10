package test;

public class Construc {
  int id;
  String name;

 /* Construc(int i,String n){
	  name=n;
	  id=i;
  }*/
 void display(){
	 System.out.println(" id = "+id+"  name = "+name+"");
 }
 public static void main(String args[]){
	 Construc s1 = new Construc();
	// Construc s2 = new Construc(12,"abdul");
	 s1.id = 101;
	 s1.name = "waew";
	 s1.display();
	 //s2.display();
 }
}
