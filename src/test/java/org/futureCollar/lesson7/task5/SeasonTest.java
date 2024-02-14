package org.futureCollar.lesson7.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.Month;
import java.util.stream.Stream;

import static org.futureCollar.lesson7.task5.Season.getSeason;

class SeasonTest {

    @ParameterizedTest
    @MethodSource("provideMonthNameForDisplaySeason")
    void shouldDisplaySeasonForGivenMonth(String monthName, String expectedSeason) {
        //given
        Month month = Month.valueOf(monthName.toUpperCase());
        //when
        String actualSeason = String.valueOf(getSeason(month));
        //then
        Assertions.assertEquals(expectedSeason, actualSeason);
    }

    private static Stream<Arguments> provideMonthNameForDisplaySeason() {
        return Stream.of(
                Arguments.of("MAY", "spring"),
                Arguments.of("fEBRUARY", "winter")
        );
    }
}
