package com.example.java10;
public class AnnotationDemo01 extends DoSomethingClass{

    @Override//Annotation
    public String getData(){
        return "Java change your life";
    }

    @Deprecated//cu roi nen dung cai khac
    /*
       Vector -> ArrayList
     */
    public void doBiz(){
        System.out.println("doBiz in @Derrecated");
    }

}
