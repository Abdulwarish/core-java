package test;

public class Triangle1 {

	public static void main(String[] args) {
		int i=1,j=1;int l=1;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				if(j>1){
					System.out.print("* ");
				}
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
			
		}

	}

}
