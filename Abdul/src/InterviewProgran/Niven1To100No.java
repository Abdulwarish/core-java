package InterviewProgran;
public class Niven1To100No {

    static void print(String value) {
        System.out.print(value);
    }

    static int findSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i % findSumOfDigits(i) == 0) { //if sum of digits can divide the number, then it is a Harshad number
                print(i + " ");
            }
        }

    }
}