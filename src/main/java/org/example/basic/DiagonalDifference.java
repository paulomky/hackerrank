package org.example.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>(
            Arrays.asList(
                    Arrays.asList(11, 2, 4, 4)
                    , Arrays.asList(4, 5, 6, 27)
                    , Arrays.asList(10, 8, -12, 44)
                    , Arrays.asList(32, 11, 1, 28)
            )
        );

        System.out.println(diagonalDifference(matrix));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;

        long lrCross = 0L;
        long rbCross = 0L;

        for(List<Integer> list : arr) {
            lrCross = lrCross + list.get(l);
            rbCross = rbCross + list.get(r);
            l = l + 1;
            r = r - 1;
        }

        return (int) Math.abs(rbCross - lrCross);
    }
}
