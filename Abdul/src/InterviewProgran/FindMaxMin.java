package InterviewProgran;

import java.util.Arrays;

public class FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {12,34,56,87,78,98,12,34,54};
		System.out.println(Arrays.stream(ar).max().getAsInt());
		System.out.println(Arrays.stream(ar).min().getAsInt());
		System.out.println(Arrays.stream(ar).average().getAsDouble());

	}

}
