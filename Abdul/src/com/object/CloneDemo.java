package com.object;

public class CloneDemo implements Cloneable{
		int id;
		String name;
		
		CloneDemo(int id,String name){
			this.id=id;
			this.name=name;
		}
		public Object clone()throws CloneNotSupportedException {
			return super.clone();
		}
	public static void main(String[] args) {
		try {
			CloneDemo ob=new CloneDemo(12,"Waris");
			CloneDemo ob1 = (CloneDemo)ob.clone();
			System.out.println(ob.id+" "+ob.name);
			System.out.println(ob1.id+" "+ob1.name);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Thread t=new Thread();

	}

}
