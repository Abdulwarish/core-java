package logicalquestion;

public class Demo {

	public static void main(String[] args) {
		int c=0;
		int ar[]= {0,0,0,0,0,1,1,1,1,1,1};
		for(int i=0;i<=ar.length;i++) {
			c+=ar[i];						//find  indext values of first 1
			if(c>2) {
				System.out.println("Third 1 index is="+i);
				break;
			}
		}										

	}

}
