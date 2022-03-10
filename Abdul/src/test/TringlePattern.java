package test;

public class TringlePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		int i,j;
		for(i=1; i<=5;i++){
			for(j=1; j<=i;j++){
			        if(j>1){
			        	System.out.print("* ");
			        	}
					System.out.print(k+" ");
					k++;
				}
			System.out.println();

			}
	  }
	  

}
