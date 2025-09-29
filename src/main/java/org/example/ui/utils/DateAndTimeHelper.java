package org.example.ui.utils;

import org.example.common.data.constant.DateAndTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTimeHelper {

    private static final LocalDate TODAY = LocalDate.now();

    public static String getTodayDateInFormat(String dateFormat) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

        return TODAY.format(formatter);
    }

    public static String getTodayDateInFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateAndTimeFormat.DEFAULT_MM_DD_YYYY);

        return TODAY.format(formatter);
    }

    public static String getTodayDatePlusDaysInFormat(String dateFormat, int days) {
        LocalDate date = TODAY.plusDays(days);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

        return date.format(formatter);
    }

    public static String getTodayDatePlusDaysInFormat(int days) {
        LocalDate date = TODAY.plusDays(days);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateAndTimeFormat.DEFAULT_MM_DD_YYYY);

        return date.format(formatter);
    }

    public static String getCertainInFormat(String dateFormat, int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

        return date.format(formatter);
    }

    public static String getCertainInFormat(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateAndTimeFormat.DEFAULT_MM_DD_YYYY);

        return date.format(formatter);
    }

    public static String getCertainDateOrPartInFormatString(LocalDate date, String dateFormat) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

        return date.format(formatter);
    }

    public static String getCertainDateOrPartInFormatString(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateAndTimeFormat.DEFAULT_MM_DD_YYYY);

        return date.format(formatter);
    }
}
