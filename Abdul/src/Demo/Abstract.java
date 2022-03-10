package Demo;

 abstract class Base { 
    abstract void fun(); 
} 
class Derived extends Base { 
    void fun() { 
    	System.out.println("Abstract Called");
    	} 
} 
public class Abstract { 
    public static void main(String args[]){  
      Base b = new Derived(); 
        b.fun();  
    } 
}