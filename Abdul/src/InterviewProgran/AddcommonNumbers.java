package InterviewProgran;

public class AddcommonNumbers {

	public static void main(String[] args) {
		int ar[]= {10,35,70,55,15,40,75,60,70};
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+5==ar[j]) {
					System.out.println(ar[i]+" - "+ar[j]);
				}
			}
		}
	}
}
