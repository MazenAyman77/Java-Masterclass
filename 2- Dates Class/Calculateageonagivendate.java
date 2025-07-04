package com.amigoscode;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Calculateageonagivendate {

    private static int ageCalculator(LocalDate date){
        return LocalDate.now().getYear() - date.getYear();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your year of birth :");
        int year = scanner.nextInt();
        System.out.println("enter your month of birth :");
        int month = scanner.nextInt();
        System.out.println("enter your day of month of birth :");
        int dayofmonth = scanner.nextInt();
        System.out.println("you have " + ageCalculator(LocalDate.of(year,month,dayofmonth))+" years");

//        LocalDate localDate1 = LocalDate.now();
//        Period period = Period.between(localDate1, LocalDate.of(2001,5,17));
//        System.out.println("you have " + period.getYears() + " years, "
//                + period.getMonths() + " months and "
//                + period.getDays() + " days");
    }
}
