package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	int a=10;
	int b=20;
}
public class Serialization {
	public static void main(String[] args) throws IOException {
		System.out.println("Serialization Started");
		FileOutputStream fos=new FileOutputStream("fileSerialize");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Demo d1=new Demo();
		oos.writeObject(d1);
		System.out.println("Serialization Ended");
		
		
		
	
	}

}
