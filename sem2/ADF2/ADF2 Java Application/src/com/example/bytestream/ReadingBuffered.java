package com.example.bytestream;


import java.io.*;

public class ReadingBuffered {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("D:\\fptaptech\\sem2\\Data.txt");
        Reader reader = new InputStreamReader(inputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String message = "";
        //message = bufferedReader.readLine();
        int i = 0;

        while ((message=bufferedReader.readLine())!=null)
        {
            i++;
            System.out.println(message);
        }
        bufferedReader.close();
    }
}
