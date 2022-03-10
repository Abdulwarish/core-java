package filepractice;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File1 {

	public static void main(String [] args) throws IOException {
		/*int c=0;
		FileWriter fr=new FileWriter("javaNotes.text");
		fr.write(100);
		fr.write("\nMy name is abdul waris i am java developer");
		fr.write('j');
		//fr.write("\nJ softIndia",2,3);
		fr.flush();
		fr.close();
		*/
		
		/*FileReader fr=new FileReader("javaNotes.text");
		int i=fr.read();
		while(i!=-1) {
			System.out.println((char)i);
			break;
		}
		fr.close();*/
		
		File f=new File("javaNotes.text");
		FileReader f1=new FileReader(f);
		char ch[]=new char[(int)f.length()];
		f1.read(ch);
		for(char ch1:ch) {
			System.out.print(ch1);
		}
		
		
	}
}