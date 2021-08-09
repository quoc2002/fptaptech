package com.example.bytestream;
import java.io.*;
import java.io.BufferedInputStream;
import java.io.IOException;

public class ReadingStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream readData = new BufferedInputStream(System.in);
      try{
          char ch = (char)readData.read();
          System.out.println(ch);
      }catch (Exception e){
          System.out.println(e);
      }finally {
          readData.close();
      }
    }
}
