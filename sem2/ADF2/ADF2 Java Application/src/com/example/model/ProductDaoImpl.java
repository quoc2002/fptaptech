package com.example.model;

import com.example.dao.DBConnection;
import com.example.entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class ProductDaoImpl implements ProductDao{

    private final Connection conn = DBConnection.createConnection();
    private final String SQL_CREATE_PRODUCT = "INSERT INTO products(productName, productDesc, productPrice) VALUE(?, ?, ?)";
    private final String SQL_GET_PRODUCT_BY_ID = "SELECT * FROM product WHERE Id=?";
    private final String SQL_GET_ALL_PRODUCTS = "SELECT * FROM products";
    private final String SQL_UPDATE_PRODUCT = "UPDATE products SET productName=?, productDesc=?, productPrice=? WHERE Id=?";
    private final String SQL_DELETE_PRODUCT = "DELETE FROM products Where ID=?";

    @Override
    public void createProduct(Product product) {
        try(PreparedStatement pstmt = conn.prepareStatement(SQL_CREATE_PRODUCT, Statement.RETURN_GENERATED_KEYS)){

            pstmt.setString(1, product.getProductName());
            pstmt.setString(2, product.getProductDesc());
            pstmt.setDouble(3, product.getProductPrice());
            pstmt.executeUpdate();
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()){
                if (generatedKeys.next()) {
                    product.setProductId(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException ex){
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Product getProductById(int productId) {
        Product product = new Product();
        try(PreparedStatement pstmt = conn.prepareStatement(SQL_GET_PRODUCT_BY_ID)){
            pstmt.setInt(1, productId);
            try( ResultSet rs = pstmt.executeQuery()){
                while (rs.next()){
                    product.setProductId(rs.getInt(1));
                    product.setProductName(rs.getString(2));
                    product.setProductDesc(rs.getString(3));
                    product.setProductPrice(rs.getDouble(4));
                }
            }
        }catch (SQLException ex){
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> allProducts = new ArrayList();
        try(PreparedStatement pstmt = conn.prepareStatement(SQL_GET_ALL_PRODUCTS);
          ResultSet rs = pstmt.executeQuery()){
              while (rs.next()){
                  Product product = new Product();
                  product.setProductId(rs.getInt(1));
                  product.setProductName(rs.getString(2));
                  product.setProductDesc(rs.getString(3));
                  product.setProductPrice(rs.getDouble(4));
                  allProducts.add(product);
              }
          }catch (SQLException ex){
              Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
          }
        return allProducts;
    }

    @Override
    public void updateProduct(Product product) {
        try(PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE_PRODUCT)){
            pstmt.setString(1, product.getProductName());
            pstmt.setString(2, product.getProductDesc());
            pstmt.setDouble(3, product.getProductPrice());
            pstmt.setInt(8, product.getProductId());
            pstmt.executeUpdate();
        }catch (SQLException ex){
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public boolean deleteProduct(int productID) {
        try(PreparedStatement pstmt = conn.prepareStatement(SQL_DELETE_PRODUCT)){
            pstmt.setInt(1, productID);
            pstmt.executeUpdate();
            return true;
        }catch (SQLException ex){
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
