package logicalquestion;

public class BubbbleShort {

	public static void main(String[] args) {
		int arr[]= {12,34,456,6,3,789,654,34,2,1,97,354};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++){
			System.out.println("Shorting = "+arr[k]);
		}
	}

}
