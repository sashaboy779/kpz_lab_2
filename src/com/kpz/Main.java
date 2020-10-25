package com.kpz;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        var mars = new Planet("Mars", 6566.1255, getDate(1, 1, 1610));
        var copy = (Planet)mars.clone();

        System.out.println("Original " + mars);
        System.out.println("Copy " + copy);

        System.out.printf("References are equal: %s%n", copy == mars);
        System.out.printf("Contents are equal: %s%n", copy.equals(mars));

        var date = mars.getDateOfDiscovery();
        date.setYear(1700);
        System.out.println("Original after date change to 1700 \n" + mars);
    }

    private static Date getDate(int date, int month, int year)
    {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DATE, 1);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.YEAR, 1610);

        return calendar.getTime();
    }
}
