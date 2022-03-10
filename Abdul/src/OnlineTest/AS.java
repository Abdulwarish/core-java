package OnlineTest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'arrange' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING sentence as parameter.
     */

    public static String arrange(String sentence) 
    {
    // Write your code here
            String s=sentence.substring(0,1);
            String s1=sentence.substring(2);
            String s2=s+s1;
            System.out.println(s2);
            return s2;
    }
}
public class AS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String sentence = bufferedReader.readLine();

        String result = Result.arrange(sentence);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
