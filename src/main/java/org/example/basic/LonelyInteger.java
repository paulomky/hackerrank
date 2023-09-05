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

public class LonelyInteger {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int result = lonelyinteger(a);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        System.out.println(lonelyinteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1)));
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Integer lonelyInt = null;

        for(int i = 0; i < a.size(); i++) {
            int ii = i;
            Integer numbersFound = a.stream().filter(x -> x.equals(a.get(ii))).collect(toList()).size();
            if(numbersFound.equals(1)){
                lonelyInt = a.get(ii);
            }
        }

        return lonelyInt;
    }
}
