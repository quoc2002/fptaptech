package com.example.java09;

import java.util.Calendar;

public class CalendarClassDemo {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month +1);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);

        int minute = calendar.get(Calendar.MINUTE);
        System.out.println(minute);

        int second = calendar.get(Calendar.SECOND);
        System.out.println(second);

        int millis = calendar.get(Calendar.MILLISECOND);
        System.out.println(millis);
    }
}
