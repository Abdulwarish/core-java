package fileIO;

import java.io.FileReader;
import java.io.IOException;

public class FileRdr {

	public static void main(String[] args)throws IOException {
		
		int i,c=0;
		FileReader fr=new FileReader("E://EclipsProgram//Abdul/jsoft123.text");
		int j=fr.read();
		while(j!=-1){
			j=fr.read();
			System.out.print((char)j);
			c++;
			
		}
		System.out.println(c);
	}
}
