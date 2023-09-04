package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }

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
