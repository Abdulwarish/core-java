package fileIO;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		File f=new File("jsoft123");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		System.out.println("----------------------------------------------");
		File f1=new File("jsoft123");
		f1.mkdir();
		File f2=new File("jsoft123","waris.text");
		f2.createNewFile();
		System.out.println(f1.exists());
		
		System.out.println("----------------------------------------------");
	//WAP to count file
		int count=0;
		File f3=new File("jsoft123");
		String s[]=f3.list();
		for(String s1:s) {
			count++;
			System.out.println(count);
	System.out.println("----------------------------------------------");
		
		File f4=new File("jsoft123");
		String s2[]=f4.list();
		for(String s3:s2) {
			File f5=new File(f4,s3);
			if(f5.isFile()) {
				System.out.println(s3);
				
			}
		}
			
		}

	}

}
