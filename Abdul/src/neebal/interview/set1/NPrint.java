package neebal.interview.set1;
public class NPrint{

     public static void main(String []args){
        int i, j, counter = 0;
        for (i = 0; i < 7; i++) {
            System.out.printf("*");
            for (j = 1; j <= 7; j++) {
                if (j == 6)
                    System.out.printf("*");
                else if (j == counter)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            counter ++;
            System.out.printf("\n");
    }
     }
}
