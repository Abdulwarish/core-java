package serialization;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		/*File obj=new File("IstiyaQ");
		File obj1=new File("IstiyaQ","java.text");
		obj1.createNewFile();*/
		
		FileWriter obj2=new FileWriter("java.text",true);
		obj2.write("I am Istiyaq I have Done Java ");
		obj2.flush();
		obj2.write("My Name Abdul Waris");
		obj2.close();
		

	}

}
