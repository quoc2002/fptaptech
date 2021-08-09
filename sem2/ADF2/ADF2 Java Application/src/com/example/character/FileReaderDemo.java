package com.example.character;

import java.io.*;


public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("D:\\fptaptech\\sem2\\Data.txt");

        try{
            char ch = (char)reader.read();
            System.out.println(ch);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
