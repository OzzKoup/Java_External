package com.fibonacci;

public class NumberCounter {
    private int start = 0;
    private int end = 0;
    private int sizeOfSet = 0;

    public NumberCounter(int start, int end, int setSize) {
        this.start = start;
        this.end = end;
        this.sizeOfSet = setSize;
    }

    public void printResults() {
        countAndPrintEvenNumbersFromEnd();
        countAndPrintOddNumbersFromStart();
        countAndPrint();
    }

    private void countAndPrintEvenNumbersFromEnd() {
        int oddSum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                oddSum += i;
            }
        }
        System.out.println("Odd result : " + oddSum);
    }

    private void countAndPrintOddNumbersFromStart() {
        int evenSum = 0;
        for (int i = end; i >= start; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evenSum += i;
            }
        }
        System.out.println("Even result : " + evenSum);
    }

    private void countAndPrint() {
        int maxOdd = 0;
        int maxEven = 0;
        double sumOdd = 0;
        double sumEven = 0;
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 0; i < sizeOfSet; i++) {
            int oddFibonacciNumber = fibonacci.countFibonacci(sizeOfSet - i);
            if (oddFibonacciNumber % 2 == 1) {
                sumOdd++;
                if (maxOdd < oddFibonacciNumber) {
                    maxOdd = oddFibonacciNumber;
                    System.out.println("The biggest odd : " + maxOdd);
                }
            } else {
                sumEven++;
                if (maxEven < oddFibonacciNumber) {
                    maxEven = oddFibonacciNumber;
                    System.out.println("The biggest even : " + maxEven);
                }
            }
        }
        System.out.format("Percents of odd numbers : %.2f", (sumOdd / sizeOfSet) * 100);
        System.out.format("\nPercents of even numbers: %.2f", (sumEven / sizeOfSet) * 100);
    }
}
