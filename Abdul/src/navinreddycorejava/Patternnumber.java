package navinreddycorejava;

public class Patternnumber {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++) {
				int k=i+j-1;
				if(k>4)
				System.out.print(k-4+" ");
				else
					System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
/* for(int i=1;i<=s1;i++){
for(int j=1;j<=s1;j++)
{if(i+j<=s1+1)
{
    System.out.print(j+i-1);
}else{
    System.out.print((i+j)-s1-1);
}
}System.out.println(); */