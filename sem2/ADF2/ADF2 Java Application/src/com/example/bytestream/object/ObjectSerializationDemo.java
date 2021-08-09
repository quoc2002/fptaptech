package com.example.bytestream.object;

import com.sun.xml.internal.org.jvnet.fastinfoset.FastInfosetException;

import java.io.*;

public class ObjectSerializationDemo {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream("D:\\fptaptech\\sem2\\ADF2\\object.dat")));

            //Create an array of 10 SerializedObject with asc numbers
            SerializedObject[]  objs =new SerializedObject[10];
            for(int i =0;i<objs.length;i++){
                objs[i] = new SerializedObject(i);
            }
            //Write the 10 objects to file, one by one.
            for(int i = 0;i< objs.length;i++){
                out.writeObject(objs[i]);
            }
            out.writeObject(objs);
            out.close();

            //Read back the object
            in = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("D:\\fptaptech\\sem2\\ADF2\\object.dat")));
            SerializedObject objIn;
            for (int i = 0 ;i< objs.length;i++){
                objIn = (SerializedObject) in.readObject();
                System.out.println(objIn.getNumber());
            }
            SerializedObject[] objArrayIn;
            objArrayIn = (SerializedObject[]) in.readObject();


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
