package com.fibonacci;

import java.util.List;

public class FibonacciInitializer {
    private int start;
    private int end;
    private int sizeOfSet;
    private double sumFibonacciEvenNumbers;
    private double sumFibonacciOddNumbers;

    public FibonacciInitializer(int start, int end, int setSize) {
        this.start = start;
        this.end = end;
        this.sizeOfSet = setSize;
    }

    public void printResults() {
        printEvenNumbers();
        printOddNumbers();
        printMaxFibonacciNumbers();
        countFibonacciNumbersSum();
        printPercents();
    }

    private void printMaxFibonacciNumbers() {
        List<Integer> fibonacciRow = UtilFibonacci.createRow(sizeOfSet);

        System.out.println("Max odd : " + UtilFibonacci.findMaxOdd(fibonacciRow));
        System.out.println("Max even : " + UtilFibonacci.findMaxEven(fibonacciRow));
    }

    private void printOddNumbers() {
        System.out.println("Odd numbers : ");
        UtilFibonacci.countOddNumbersFromEnd(start, end).stream().map((x) -> x + " ").forEach(System.out::print);
        System.out.println("\nSum of odd numbers : " + UtilFibonacci.countSumOfOddNumbers(start, end));
    }

    private void printEvenNumbers() {
        System.out.println("Even numbers : ");
        UtilFibonacci.countEvenNumbersFromStart(start, end).stream().map(x -> x + " ").forEach(System.out::print);
        System.out.println("\nSum of even numbers : " + UtilFibonacci.countSumOfEvenNumbers(start, end));
    }


    private void printPercents() {
        System.out.println(("Percents fibonacci even numbers : " + (sumFibonacciEvenNumbers / sizeOfSet) * 100));
        System.out.println(("Percents fibonacci odd numbers : " + (sumFibonacciOddNumbers / sizeOfSet) * 100));
    }

    private void countFibonacciNumbersSum() {
        for (Integer i : UtilFibonacci.createRow(sizeOfSet)) {
            if (i > 0) {
                if (i % 2 == 0) {
                    sumFibonacciEvenNumbers++;
                } else {
                    sumFibonacciOddNumbers++;
                }
            }
        }
    }
}
