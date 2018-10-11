package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindDigits {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int temp = n;
        int digitCounter = 0;
        List<Integer> digits = new ArrayList<Integer>();
        while(temp>0){
            int currentDigit = temp % 10;
            System.out.println(currentDigit);
            digits.add(digitCounter, currentDigit);
            digitCounter++;
            temp /= 10;
        }
        
        int result = 0;
        for(int i = 0; i < digitCounter; i++){
            int currentDigit = digits.get(i);
            if(currentDigit > 0 && n%currentDigit == 0)
                result++;
        }
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
