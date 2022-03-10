import java.util.Scanner;

public class FibonacciSeriase {

	public static void main(String[] args) {
		int f,f1=0,f2=1,no=5;
		System.out.print("Fibonacci Seriease: ");
		System.out.print(f1+" "+f2);
		for(int i=1;i<=no;i++) {
			f=f1;
			f1=f2;
		f2=f+f2;
		System.out.print(" "+f2);
		}
		
		
	}

}
