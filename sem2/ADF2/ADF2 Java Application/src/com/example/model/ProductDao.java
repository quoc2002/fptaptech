package com.example.model;

import com.example.entity.Product;

import java.util.ArrayList;

public interface ProductDao {

    public void createProduct(Product product);

    public Product getProductById(int productId);

    public ArrayList<Product> getAllProducts();

    public void updateProduct(Product product);

    public boolean deleteProduct(int productID);
}
