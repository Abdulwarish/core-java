package InterviewProgran;

public class BubbleShortNumber {

	public static void main(String[] args) {
		int ar[] = {0,40,8,40,5,4,7,9,11,8,0,06,4,30,64,4,6,54,0,9,1,3,15};
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if(ar[j]>ar[i]) {
					ar[i]=ar[i]+ar[j];
					ar[j]=ar[i]-ar[j];
					ar[i]=ar[i]-ar[j];
				}
			}
			
		}
		for (int k = 0; k < ar.length; k++) {
			System.out.print(ar[k]+",");
		}
	}

}
