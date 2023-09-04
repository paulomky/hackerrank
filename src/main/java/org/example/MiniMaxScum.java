package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxScum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Long maxValue = getMaxValue(arr);
        Long minValue = getMinValue(arr);

        List<Integer> minArray = removeFirstEqualsValueFromArray(arr, minValue);
        List<Integer> maxArray = removeFirstEqualsValueFromArray(arr, maxValue);

        Long sumMin = minArray.stream().mapToLong(Integer::longValue).sum();
        Long sumMax = maxArray.stream().mapToLong(Integer::longValue).sum();

        System.out.println(sumMax + " " + sumMin);
    }

    private static List<Integer> removeFirstEqualsValueFromArray(List<Integer> arr, Long value) {
        List<Integer> newArray = new ArrayList<>(arr);

        int i = 0;

        for(Integer valor : arr){
            if(Objects.equals(Long.valueOf(valor), value)){
                break;
            }
            i++;
        }

        newArray.remove(i);

        return newArray;
    }

    public static Long getMaxValue(List<Integer> arr){
        Long maxValue = Long.valueOf(arr.get(0));

        for(Integer value : arr){
            if(maxValue <= value){
                maxValue = Long.valueOf(value);
            }
        }

        return maxValue;
    }

    public static Long getMinValue(List<Integer> arr){
        Long maxValue = Long.valueOf(arr.get(0));

        for(Integer value : arr){
            if(maxValue >= value){
                maxValue = Long.valueOf(value);
            }
        }

        return maxValue;
    }
}
