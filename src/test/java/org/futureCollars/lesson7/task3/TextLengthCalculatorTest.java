package org.futureCollars.lesson7.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class TextLengthCalculatorTest {

    private static Stream<Arguments> provideStringsForGetTextLength() {
        return Stream.of(
                Arguments.of("Test", 4),
                Arguments.of("Future Collar", 13),
                Arguments.of("Mockito", 7),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringsForGetTextLength")
    void shouldReturnTextLength(String input, int expected) {
        //given
        //when
        int actualLength = TextLengthCalculator.calculateTextLength(input);
        //then
        Assertions.assertEquals(expected, actualLength);
    }
}
