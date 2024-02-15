package org.futureCollar.lesson7.task5;

import java.time.Month;

public class Season {

    public static SeasonList getSeason(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return SeasonList.winter;
            case MARCH:
            case APRIL:
            case MAY:
                return SeasonList.spring;
            case JUNE:
            case JULY:
            case AUGUST:
                return SeasonList.summer;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return SeasonList.autumn;
            default:
                throw new IllegalArgumentException("Wrong month name" + month);
        }
    }
}
