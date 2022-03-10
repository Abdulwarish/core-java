package InterviewProgran;

import java.util.Scanner;

public class CalciUsingChar {

	public static void main(String[] args) {
		int n1,n2,n3;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter symbol");
    	char ch[]=sc.nextLine().toCharArray();
    	for(int i=0;i<=0;i++) {
    		char ch1=ch[i];
    	while(ch1>=1) {
    		switch (ch1) {
    		case '+':
    			System.out.println("Enter Number");
    			n1=sc.nextInt();
    			n2=sc.nextInt();
    			n3=n1+n2;
    			System.out.println(n3);
    			break;
    		case '-':
    			System.out.println("Enter Number");
    			n1=sc.nextInt();
    			n2=sc.nextInt();
    			n3=n1-n2;
    			System.out.println(n3);
    			break;
    		case '*':
    			System.out.println("Enter Number");
    			n1=sc.nextInt();
    			n2=sc.nextInt();
    			n3=n1*n2;
    			System.out.println(n3);
    			break;
    		case '/':
    			System.out.println("Enter Number");
    			n1=sc.nextInt();
    			n2=sc.nextInt();
    			n3=n1/n2;
    			System.out.println(n3);
    			break;
    		}
    			
    		}
    	}

	}

}
