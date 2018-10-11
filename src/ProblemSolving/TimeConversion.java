package ProblemSolving;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.lang.Integer;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        int hh;
        hh = Integer.valueOf(s.substring(0,2));
        char time = s.charAt(8);
        if((hh < 12 && time == 'A') || (hh == 12 && time == 'P'))
            return s.substring(0,8);
        if(hh == 12 && time == 'A')
            hh = 0;
        else if(hh < 12 && time == 'P')
            hh += 12;
        
        if(hh < 10)
            return "0" + hh + s.substring(2,8);
        else
            return hh + s.substring(2,8);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
