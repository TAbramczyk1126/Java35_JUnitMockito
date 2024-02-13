package org.futureCollars.lesson7.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;


class UpperCaseFormatterTest {

    @ParameterizedTest
    @ValueSource(strings = {"Tomek", "DOM", "D9k"})
    @EmptySource
    void shouldConvertTextToUpperCase(String text) {
        //given
        String expectedText = text.toUpperCase();
        //when
        String actualText = UpperCaseFormatter.toUpperCase(text);
        //then
        Assertions.assertEquals(expectedText, actualText);
    }
    @ParameterizedTest
    @NullSource
    void shouldConvertTextToUpperCaseForNull(String text) {
        //given
        //when
        String actualText = UpperCaseFormatter.toUpperCase(text);
        //then
        Assertions.assertEquals("", actualText);
    }


}
