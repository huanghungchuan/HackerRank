package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
        boolean check = false;
        for(int i = p; i < q; i++){
            long square = (long) i * i;
            String squareStr = String.valueOf(square);
            String left  = squareStr.substring(0, squareStr.length() / 2);
            String right = squareStr.substring(squareStr.length() / 2);
            int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
            int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);
            if(numL + numR == i){
                if(check == true)
                    System.out.print(" " + i);
                else{
                    check = true;
                    System.out.print(i);
                }
            }
        }
        if(check == false)
            System.out.println("INVALID RANGE");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
