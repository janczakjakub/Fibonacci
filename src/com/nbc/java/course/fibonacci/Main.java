package com.nbc.java.course.fibonacci;

public class Main {
    public static void main(String... args) {
        System.out.println("Fibonacci's series ");
        int quantityOfNumber = 20;

        if (isNegativeNumber(quantityOfNumber)) {
            for (int n = 0; n < quantityOfNumber; n++) {
                System.out.println(n + 1 + " => " + fib(n));
            }
        } else {
            System.out.println("Quantity should be positive number"); // throw exception
        }
    }

    private static boolean isNegativeNumber(int n) {
        return n > 0;
    }

    private static int fib(double n) {
        if (n == 0) {
            return 0;
        }
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
