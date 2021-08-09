package com.example.java09;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeClassDemo02 {

    public static void main(String[] args) {
        Date d1 = new Date();//tao 1 object kieu Date;

       /* try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(duration
                    2));
        }catch (Exception ex){
            System.out.println("Loi ngoai le");
        }*/

        Date d2 = new Date();

        long m1 = System.currentTimeMillis();//1/1/1970-now
        int i = d1.compareTo(d2);

        boolean before = d1.before(d2);
        System.out.println(before);
    }
}
