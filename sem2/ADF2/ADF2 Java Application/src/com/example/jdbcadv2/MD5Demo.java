package com.example.jdbcadv2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

public class MD5Demo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String password = "khongbiet@123";
        byte [] digest = md5.digest(password.getBytes());
        BASE64Encoder encoder = new BASE64Encoder();
        String encoded = encoder.encode(digest);
        System.out.println("Digested: "+ encoded);

    }
}
