package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedRdr {

	public static void main(String[] args)throws IOException {
		FileReader f=new FileReader("jsoft1234.text");
		BufferedReader br=new BufferedReader(f);
		String line=br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}
