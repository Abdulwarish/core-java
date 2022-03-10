package com.java.oops;
class Tod extends Thread{
	public void run() {
		System.out.println("this is sakinaka location");
	}
}

public class InstanceOf_  {

	public static void main(String[] args) {
	Tod u=new Tod();
	u.start();
		
		System.out.println(u instanceof Thread);
		
	}

}
