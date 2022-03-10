package test;

public class Simple {
int id;
String name;

Simple(){
	System.out.println("default constructor");
	
}
Simple(int id,String name){
	this.id=id;
	this.name=name;
}
void display(){
	System.out.println("id ="+id+" name= "+name+"");
}
public static void main(String args[]){
	Simple sim=new Simple();
	Simple sim1=new Simple(121,"abdul waris");
	sim1.display();
	
}
}
