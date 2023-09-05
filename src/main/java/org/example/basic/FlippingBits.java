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

public class FlippingBits {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                long n = Long.parseLong(bufferedReader.readLine().trim());
//
//                long result = flippingBits(n);
//
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
        System.out.println(flippingBits(4));
        System.out.println(flippingBits(123456));
    }

    public static long flippingBits(long n) {
        // Write your code here
        String binary32 = String.format("%1$" + 32 + "s", Long.toBinaryString(n)).replace(' ', '0');
        String binaryFlipped = flipBinary(binary32);
        return Long.parseLong(binaryFlipped, 2);
    }

    public static String flipBinary(String binaryString) {
        String[] binarySplitted = binaryString.split("");
        List<String> newBinary = new ArrayList<>();

        for(String bit : binarySplitted) {
            Integer newBit = Integer.valueOf(bit);
            if(newBit.equals(0))
                newBit = 1;
            else
                newBit = 0;

            newBinary.add(String.valueOf(newBit));
        }

        return String.join("", newBinary);
    }
}
