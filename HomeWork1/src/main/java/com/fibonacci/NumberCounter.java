package com.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class NumberCounter {
    private int start;
    private int end;
    private int sizeOfSet;
    private double sumFibonacciEvenNumbers;
    private double sumFibonacciOddNumbers;

    public NumberCounter(int start, int end, int setSize) {
        this.start = start;
        this.end = end;
        this.sizeOfSet = setSize;
    }

    public void printResults() {
        printEvenNumbers();
        printOddNumbers();
        printMaxFibonacciNumbers();
        countFibonacciSum();
        printPercents();
    }

    private void printMaxFibonacciNumbers() {
        List<Integer> fibonacciRow = Fibonacci.createRow(sizeOfSet);

        System.out.println("Max odd : " + Fibonacci.findMaxOdd(fibonacciRow));
        System.out.println("Max even : " + Fibonacci.findMaxEven(fibonacciRow));
    }

    private void printOddNumbers() {
        System.out.println("Odd numbers : ");
        countOddNumbersFromEnd().stream().map((x) -> x + " ").forEach(System.out::print);
        System.out.println("\nSum of odd numbers : " + countSumOfOddNumbers());
    }

    private void printEvenNumbers() {
        System.out.println("Even numbers : ");
        countEvenNumbersFromStart().stream().map(x -> x + " ").forEach(System.out::print);
        System.out.println("\nSum of even numbers : " + countSumOfEvenNumbers());
    }

    private List<Integer> countOddNumbersFromEnd() {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }

    private List<Integer> countEvenNumbersFromStart() {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = end; i >= start; i--) {
            if (i % 2 == 0) {
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }

    private int countSumOfEvenNumbers() {
        int oddNumbersSum = 0;
        for (Integer i : countEvenNumbersFromStart()) {
            oddNumbersSum += i;
        }
        return oddNumbersSum;
    }

    private int countSumOfOddNumbers() {
        int evenNumbersSum = 0;
        for (Integer i : countOddNumbersFromEnd()) {
            evenNumbersSum += i;
        }
        return evenNumbersSum;
    }

    private void countFibonacciSum() {
        for (Integer i : Fibonacci.createRow(sizeOfSet)) {
            if (i > 0) {
                if (i % 2 == 0) {
                    sumFibonacciEvenNumbers++;
                } else {
                    sumFibonacciOddNumbers++;
                }
            }
        }
    }

    private void printPercents() {
        System.out.println(("Percents fibonacci even numbers : " + (sumFibonacciEvenNumbers / sizeOfSet) * 100));
        System.out.println(("Percents fibonacci odd numbers : " + (sumFibonacciOddNumbers / sizeOfSet) * 100));
    }
}
