package test;

public class Reverse {

	public static void main(String[] args){

        int num = 1265, reversed = 0,rem;

        while(num != 0) {
            rem = num % 10;
            reversed = reversed * 10 + rem;
            num =num/10;
        }

        System.out.println("Reversed Number: " + reversed);

	}

}
