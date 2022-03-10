class Bike{  
  void run(){
	  System.out.println("running");
	  }  
}  
class Overriding extends Bike{  
  void run(){
	  System.out.println("running safely with 60km");
	  }  
 public static void main(String args[]){  
	  Bike b = new Overriding(); 
	  b.run();  
  }  
}  
