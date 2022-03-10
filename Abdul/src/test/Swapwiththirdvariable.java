package test;

public class Swapwiththirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*int temp,a=10,b=20;
			temp=a;
			b=temp;
			a=temp+b;
		System.out.println("A="+a+"\nB="+b);*/
		int no=17,c=0;
		/*for(int i=2;i<=no/2;i++){
			if(no%i==0){
				c++;
			}
			
		}*/
		int i=2;
		while(i<=no/2){
			if(no%i==0){
			c++;
			
		  }
			i++;
		}
			if(c==0){
				System.out.println("Prime number");
			}
		
			else{
				System.out.println("not prime number");
			}
		}
			
	

}
