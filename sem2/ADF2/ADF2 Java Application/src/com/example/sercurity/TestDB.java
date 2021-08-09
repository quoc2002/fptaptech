package com.example.sercurity;
import java.sql.*;
public class TestDB {
    public static void main(String[] args) {
           String url = "jdbc:mysql://localhost:3306/Student";
           String user = "root";
           String password ="";
           String sql = " select * from student";
           try(Connection connection = DriverManager.getConnection(url,user,password)){
               System.out.println("Database :" + connection.getCatalog());
               Statement statement = connection.createStatement();
               ResultSet resultSet = statement.executeQuery(sql);
               showInfor(resultSet);
           }catch (SQLException throwables){
               throwables.printStackTrace();
           }
    }

    private static void showInfor(ResultSet resultSet){
        try{
            while(resultSet.next()){
                System.out.println(resultSet.getString(1)+" - " + resultSet.getString(2)
                + " - " + resultSet.getString(3) + " - " + resultSet.getString(4));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
