package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DayOfTheProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int days[] = {31,0,31,30,31,30,31,31,30,31,30,31};
        int remain = 256;
        String dayStr, monthStr;
        if(year > 1918)
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 > 0))
                remain -= 29;
            else
                remain -= 28;

        else if(year < 1918){
            remain -= year % 4 == 0 ? 29 : 28;
        }
        else{
            remain -= 15;
        }
        int month = 0;
        while(days[month] < remain)
            remain -= days[month++];
        month++;
        dayStr = (remain > 10) ? ""+remain : "0"+remain;
        monthStr = (month > 10) ? "" + month : "0" + month;
        return dayStr+"."+monthStr+"."+year;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
