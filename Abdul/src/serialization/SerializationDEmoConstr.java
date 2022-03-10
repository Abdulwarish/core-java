package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializationDEmoConstr {
	int id;
	String name;
	int age;
	public SerializationDEmoConstr(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
	class PersistExample{
	public static void main(String[] args) throws FileNotFoundException, IOException {
		SerializationDEmoConstr ob=new SerializationDEmoConstr(12,"Waris",23);
		FileOutputStream fos=new FileOutputStream("persibook");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ob);
		oos.flush();
		System.out.println("Successfully converted");
		
		
	}

}
