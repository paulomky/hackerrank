package org.example;

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

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        Integer arraySize = arr.size();
        // Write your code here
        Integer negatives = arr.stream().filter(x -> x < 0).collect(toList()).size();
        Integer positives = arr.stream().filter(x -> x > 0).collect(toList()).size();
        Integer zeros = arr.stream().filter(x -> x == 0).collect(toList()).size();

        float pNegatives = (float) negatives / arraySize;
        float pPositives = (float) positives / arraySize;
        float pZeros = (float) zeros / arraySize;

        System.out.println(String.format("%.5f", pPositives));
        System.out.println(String.format("%.5f", pNegatives));
        System.out.println(String.format("%.5f", pZeros));
    }
}

public class Exercice1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
