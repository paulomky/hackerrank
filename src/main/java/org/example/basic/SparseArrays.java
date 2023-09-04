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

public class SparseArrays {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine();
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .collect(toList());
//
//        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine();
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .collect(toList());
//
//        List<Integer> res = matchingStrings(strings, queries);
//
//        bufferedWriter.write(
//                res.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();




        var strings = Arrays.asList(
                "abcde"
                ,"sdaklfj"
                ,"asdjf"
                ,"na"
                ,"basdn"
                ,"sdaklfj"
                ,"asdjf"
                ,"na"
                ,"asdjf"
                ,"na"
                ,"basdn"
                ,"sdaklfj"
                ,"asdjf"
        );
        var queries = Arrays.asList(
                "abcde"
                ,"sdaklfj"
                ,"asdjf"
                ,"na"
                ,"basdn"
        );

        System.out.println(matchingStrings(strings, queries));
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        List<Integer> returnedArray = new ArrayList<>();

        for(String value : queries) {
            var qtdRepeted = strings.stream().filter(x -> x.equalsIgnoreCase(value)).collect(toList()).size();
            returnedArray.add(qtdRepeted);
        }

        return returnedArray;
    }
}