package org.futureCollars.lesson7.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TextLengthCalculatorTest {

   private static Stream<Arguments> provideStringsForGetTextLength(){
       return Stream.of(
               Arguments.of("Test", 4),
               Arguments.of("", ),
               Arguments.of("", ),
               Arguments.of("", )
       )
   }

    @ParameterizedTest
   @MethodSource ("provideStringsFormGetTextLength")
   void shouldReturnTextLength(String input, int expected){
       int actualLength = TextLengthCalculator.calculateTextLength(input);
        Assertions.assertEquals(expected, actualLength);
    }
}