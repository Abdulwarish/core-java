package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DemoSer implements Serializable{
	String a="A";
	String b="B";
	void m1(){
		String e="Qadeer";
		System.out.println("Hello how Are You");
		System.out.println(e);
	}
}
public class SerTestOnly {
	public static void main(String[] args)throws IOException {
		System.out.println("Serialization Started");
		FileOutputStream f=new FileOutputStream("Waris.Serialization");
		ObjectOutputStream f1=new ObjectOutputStream(f);
		DemoSer o=new DemoSer();
		f1.writeObject(o);
		System.out.println("Serialization Ended And SuccesFullyCreated");
		o.m1();
	}
}
