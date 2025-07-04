package com.amigoscode;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateofbirthusingLocalDate {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2001, Month.FEBRUARY,7).format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
    }
}
