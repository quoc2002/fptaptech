package com.example.ui;
import com.example.controller.ProductService;
import com.example.entity.Product;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductConsole {
    private final Scanner sc;
    ProductService productService = new ProductService();

    public ProductConsole() throws  IOException{
        this.sc = new Scanner(System.in);
    }

    private int menu() {
        System.out.println("---PRODUCT MENU---");
        System.out.println("1. Add product");
        System.out.println("2. Show all product");
        System.out.println("3. Remove product");
        System.out.println("0. Exit");
        int choice = readInt(0, 3);
        return choice;
    }

    public void start() {
        while (true) {
            int choice = menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    addProduct();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    removeProduct();
                    break;
                default:
                    throw new AssertionError();

            }
        }
    }

    private void addProduct() {
    }

    private int readInt(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= min && choice <= max) {
                    break;
                }
            } catch (NumberFormatException e) {
            }
        }
        return choice;
    }

    private double readDouble(int min, double max){
        double price;
        while (true){
            try{
                price = Double.parseDouble(sc.nextLine());
                if(price >= min && price <= max){
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid value. Try to enter a float value");
            }
        }
        return price;
    }
     private void AddProduct(){

         System.out.println("Enter product name: ");
         String name = sc.nextLine();
         System.out.println("Enter product desc: ");
         String desc = sc.nextLine();
         System.out.println("Enter product price: ");
         double price = readDouble(0, Double.MAX_VALUE);
         Product product = new Product(name, desc, price);
         productService.createProduct(product);
     }

     private void showAll(){
         System.out.println("--All product--");
         System.out.println("ID\tName\tDesc\tPrice");
         ArrayList<Product> allProducts = productService.getAllProducts();

         allProducts.forEach((product) ->{
             System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getProductDesc() + "\t" + product.getProductPrice());
         });
     }
     private  void removeProduct(){
         System.out.println("Enter Id of product");
         int id = readInt(0, Integer.MAX_VALUE);
         boolean result = productService.deleteProduct(id);
         if (result){
             System.out.println("Product was removed");
         }else {
             System.out.println("Product not found");
         }
     }
}