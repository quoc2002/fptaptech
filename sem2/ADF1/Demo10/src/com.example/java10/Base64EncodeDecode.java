package com.example.java10;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.io.UnsupportedEncodingException;


public class Base64EncodeDecode {

    public static String encodeData(String text)
            throws UnsupportedEncodingException {
        byte[] bytes = text.getBytes("UTF-8");

        String encodString = Base64.encode(bytes);
        return encodString;
    }
    public static String decodeData(String encodeText)
            throws UnsupportedEncodingException {
        byte[] decodeBytes = Base64.decode(encodeText);
        String string = new String(decodeBytes,"UTF-8");
        return string;

    }

    public static void main(String[] args)
            throws UnsupportedEncodingException {

        String text ="Java change your life";
        //Ma hoa
        String encodeText = encodeData(text);
        System.out.println(encodeText);
        //Giai ma
        String decodeText = decodeData(encodeText);
        System.out.println(decodeText);






    }
}
