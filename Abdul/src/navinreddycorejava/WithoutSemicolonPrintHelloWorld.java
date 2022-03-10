package navinreddycorejava;

public class WithoutSemicolonPrintHelloWorld {

	public static void main(String[] args) {
		if(System.out.printf("Hello world")==null) {
			
		}
		for(int i=0;i<=127;i++) {
			System.out.printf("%d :%c", i, i);//see all asci code
			System.out.println();
		}
	}

}
