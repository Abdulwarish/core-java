package fileIO;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("");
		File f=new File("demo.text");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}

}
