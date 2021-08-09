
package com.example.demo02;

public class Person {
    public String name;
    private String visaCard;

    public Person(String name) {
        this.name = name;
    }
    //this.visaCard: this thay thế cho đối tượng hiện tại
    //void: kiểu dữ liệu rỗng( nó có thể là bất kỳ)=> ko xác định
    Person person = new Person("dung");

    public void showVisaCard(){
        System.out.println("Your visa card : " + this.card);
    }

    public class Transaction{
    public void Logging(){
        System.out.println("Visa details:" + visaCard);
    }
    }
}