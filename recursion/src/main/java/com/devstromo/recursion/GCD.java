package com.devstromo.recursion;

/**
 * Euclidean algorithm, aka greatest common divisor(GSD)
 *
 * <pre>
 *     For two given numbers <strong>a</strong> and <strong>a</strong>
 *     search that <strong>a</strong> greater than or equals to <strong>b</strong>:
 *     if b/a then GCD(a,b) = b
 *     otherwise GCD(a,b) = GCD(b, a mod b)
 * </pre>
 */
public class GCD {

    public int recursive(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return recursive(b, a % b);
    }

    public int iterative(int a, int b) {

        while (b != 0) {
            var temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
