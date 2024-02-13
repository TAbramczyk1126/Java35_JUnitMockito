package org.futureCollars.lesson7.task1;

public class NumberUtils {
    public static boolean isDivisibleByTwo(int number) {
        return number % 2 == 0;
    }

    public static int sumOfDigitsOfNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
