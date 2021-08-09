package com.example.bytestream;

import  java.io.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class WritingFileDemo {
    public static void main(String[] args) throws IOException{
        String message = "Java change your life";
        BufferedOutputStream bufferedOutputStream = null;//clear dong ghi
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\fptaptech\\sem2\\Data.txt"));
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(message.getBytes());
            System.out.println("Written!!!");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            bufferedOutputStream.close();
        }
    }
}
