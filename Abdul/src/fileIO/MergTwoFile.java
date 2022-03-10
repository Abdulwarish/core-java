package fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergTwoFile {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("file4t.text");
		BufferedReader br=new BufferedReader(new FileReader("file1.text"));
		String line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		br=new BufferedReader(new FileReader("file2.text"));
		line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
			
		}
		pw.flush();
		br.close();
		pw.close();
		
		
	}

}
