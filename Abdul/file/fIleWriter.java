package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class fIleWriter {

	public static void main(String[] args)throws IOException {
		FileWriter fw=new FileWriter("jsoft1234.text",true);

		fw.write("a");
		fw.write("bdul\nWaris\n");
		fw.write("How are you");
		char ch[]= {'A','B','C'};
		fw.write(ch);
		fw.flush();
		fw.close();
	}

}
