package com.example.character;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WritingCharacterDemo {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("D:\\fptaptech\\sem2\\Data.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        String message = "The writing file";

        try{
            writer.write(message);
            System.out.println("Written!!!");

        }catch (Exception e){

        }finally {
            writer.close();
        }

    }
}
