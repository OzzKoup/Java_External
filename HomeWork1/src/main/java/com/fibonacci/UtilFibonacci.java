package com.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class UtilFibonacci {

    private UtilFibonacci() {
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

    public static List<Integer> countEvenNumbersFromStart(int start, int end) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = end; i >= start; i--) {
            if (i % 2 == 0) {
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }

    public static List<Integer> countOddNumbersFromEnd(int start, int end) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }

    public static int countSumOfEvenNumbers(int start, int end) {
        int oddNumbersSum = 0;
        for (Integer i : countEvenNumbersFromStart(start, end)) {
            oddNumbersSum += i;
        }
        return oddNumbersSum;
    }

    public static int countSumOfOddNumbers(int start, int end) {
        int evenNumbersSum = 0;
        for (Integer i : UtilFibonacci.countOddNumbersFromEnd(start, end)) {
            evenNumbersSum += i;
        }
        return evenNumbersSum;
    }
}
