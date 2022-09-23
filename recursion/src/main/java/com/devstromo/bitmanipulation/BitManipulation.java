package com.devstromo.bitmanipulation;

public class BitManipulation {

    public static int countBits(int n) {
        int counter = 0;
        while (n > 0) {
            System.out.println(n);
            counter++;
            // left shift operator: doubles the values
            // right shift operator: divides the value by 2
            n = n >> 1;

        }
        return counter;
    }

    public static boolean isEven(int n) {
        // XOR operator with 1 decrements the value for odd numbers
        // XOR operator with 1 increments the value for even numbers
        return (n ^ 1) == n + 1;
    }

    // Russian peasant multiplication
    public static int multiply(int a, int b) {
        int result = 0;

        while (b > 0) {
            // if 'b' becomes odd(XOR operator decrements the value by 1 for odd numbers)
            // we want to skip when 'b' is even
            if ((b ^ 1) == b - 1) {
                result = result + a;
            }
            // double the first number
            a = a << 1;
            // halve the second number
            b = b >> 1;
        }
        return result;
    }

    // Russian peasant multiplication with recursion
    public static int multiplyRecursion(int a, int b) {

        if (b == 1) {
            return a;
        }

        // 'b' is an odd number - this is when we add 'a'
        if (b % 2 == 1)
            return a + multiplyRecursion(2 * a, b / 2);
        else
            // we do not consider numbers when 'b' is even
            return multiplyRecursion(2 * a, b / 2);
    }
}
