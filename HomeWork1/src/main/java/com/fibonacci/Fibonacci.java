package com.fibonacci;

public class Fibonacci {
    public int countFibonacci(int fibonacciNumber) {
        if (fibonacciNumber == 0) {
            return 0;
        } else if (fibonacciNumber == 1) {
            return 1;
        } else {
            return countFibonacci(fibonacciNumber - 1) + countFibonacci(fibonacciNumber - 2);
        }
    }
}
