package org.example.basic;

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

public class TimeConversion {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = timeConversion(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        System.out.println(timeConversion("12:45:54PM"));
    }

    public static String timeConversion(String s) {
        // Write your code here
        String[] timeSplitted = s.split(":");
        String period = timeSplitted[2].substring(2, 4);
        timeSplitted[2] = timeSplitted[2].substring(0, 2);

        Long hour = Long.valueOf(timeSplitted[0]);
        if(period.equalsIgnoreCase("PM")) {
            if(hour < 12) {
                hour = hour + 12;
            }
        } else if(period.equalsIgnoreCase("AM")) {
            if(hour >= 12) {
                hour = hour - 12;
            }
        }

        String hourStr = String.valueOf(hour);

        if(hour < 10){
            hourStr = "0" + hour;
        }

        return hourStr + ":" + timeSplitted[1] + ":" + timeSplitted[2];
    }
}