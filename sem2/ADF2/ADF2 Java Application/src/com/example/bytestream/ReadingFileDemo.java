package com.example.bytestream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFileDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("D:\\fptaptech\\sem2\\Data.txt"));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        try{
            char ch = (char)bufferedInputStream.read();
            System.out.println(ch);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            bufferedInputStream.close();
        }


    }
}
