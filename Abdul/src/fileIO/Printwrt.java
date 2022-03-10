package fileIO;
import java.io.IOException;
import java.io.FileWriter;
import java.io.*;
public class Printwrt {

	public static void main(String[] args)throws IOException {
		FileWriter fr=new FileWriter("jsoft1234.text");
		PrintWriter prt=new PrintWriter(fr);
		
		prt.write('A');
		prt.write("\nMumbai");
//		prt.write();
		//prt.write("sakinjkan",1,2);
		prt.flush();
		prt.println("\n"+true);
		prt.print(12);
		prt.println();
		prt.write(65);
		prt.print(65);
		prt.println();
		prt.write("My name is Abdul Waris khan i belong to Uttar pradesh");
		prt.flush();
		prt.close();
	}

}
