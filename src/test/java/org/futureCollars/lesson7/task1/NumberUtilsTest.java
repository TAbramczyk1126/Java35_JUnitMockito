package org.futureCollars.lesson7.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 6, 8})
    void shouldReturnTrueIfNumberIsDivisibleByTwo(int number) {
        boolean results = NumberUtils.isDivisibleByTwo(number);
        Assertions.assertTrue(results);
    }

    @ParameterizedTest
    @CsvSource({"1234,10", "5668,25", "2334,12"})
    void shouldReturnSumOfDigitsOfNumber(int number, int expectedSum) {
        int result = NumberUtils.sumOfDigitsOfNumber(number);
        assertEquals(expectedSum, result);
    }
}
