package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("fileSerialize");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Demo obj=(Demo)ois.readObject();
		System.out.println(obj.a+"------Converted-------"+obj.b);
	}

}
