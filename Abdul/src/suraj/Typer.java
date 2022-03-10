package suraj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class H implements Serializable{
	int a=10;
	int b=20;
	
}
public class Typer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream ous=new FileOutputStream("asad.test");
		ObjectOutputStream oos=new ObjectOutputStream(ous);
		H h=new H();
		oos.writeObject(h);
		System.out.println("Serializable finished");
		FileInputStream ab=new FileInputStream("asad.test");
		ObjectInputStream ba=new ObjectInputStream(ab);
		H hq=(H)ba.readObject();
		System.out.println(hq.a+" "+hq.b);

	}

}
