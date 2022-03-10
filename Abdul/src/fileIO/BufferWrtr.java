package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;
public class BufferWrtr{
	public static void main(String[] args)throws IOException {
		FileWriter fw=new FileWriter("jsoft1234.text");
		BufferedWriter bfr=new BufferedWriter(fw);
		bfr.write(65);
		bfr.newLine();
		char ch[]= {'S','U','H','A','I','L','\n'};
			bfr.write(ch);
		bfr.write("Hello sir");
			bfr.newLine();
		bfr.write("Software IT");
			bfr.write("sakinaka in munmbaoi");
			bfr.write("\nAsadullah");
		bfr.flush();
			System.out.println(bfr);
		bfr.close();
		
	
	
	} 

}
