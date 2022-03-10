package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("Waris.Serialization");
		ObjectInputStream ois=new ObjectInputStream(fis);
		DemoSer obj=(DemoSer)ois.readObject();
//		FileOutputStream fo=new FileOutputStream("E://EclipsProgram//Abdul/DeserializeDemo.text");
		System.out.println("A="+obj.a+" ---------------B="+obj.b);
		//System.out.print(obj.m1());
	}
}
