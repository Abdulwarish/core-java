package fileIO;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
		//WAP TO FINE DIRECTORYES
		int count=0;
		File f=new File("E:\\EclipsProgram\\Abdul");
	String s[]=f.list();
	for(String s1:s) {
		count++;
		File f1=new File(f,s1);
		if(f1.isDirectory()) {
			System.out.println(s1);
		}
	}
	System.out.println(count);
	}
}
