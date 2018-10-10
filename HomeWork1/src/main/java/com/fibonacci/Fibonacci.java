package com.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private Fibonacci() {
    }

    public static List<Integer> createRow(int fibonacciRowSize) {
        List<Integer> fibonacciRow = new ArrayList<>();
        for (int i = 0; i <= fibonacciRowSize; i++) {
            fibonacciRow.add(countFibonacci(i));
        }
        return fibonacciRow;
    }


    public static int countFibonacci(int fibonacciNumber) {
        if (fibonacciNumber == 0) {
            return 0;
        } else if (fibonacciNumber == 1) {
            return 1;
        } else {
            return countFibonacci(fibonacciNumber - 1) + countFibonacci(fibonacciNumber - 2);
        }
    }

    public static int findMaxEven(List<Integer> fibonacciRow) {
        int maxEven = 0;
        for (Integer i : fibonacciRow) {
            if (i % 2 == 0 && maxEven < i) {
                maxEven = i;
            }
        }
        return maxEven;
    }

    public static int findMaxOdd(List<Integer> fibonacciRow) {
        int maxOdd = 0;
        for (Integer i : fibonacciRow) {
            if (i % 2 == 1 && maxOdd < i) {
                maxOdd = i;
            }
        }
        return maxOdd;
    }
}
