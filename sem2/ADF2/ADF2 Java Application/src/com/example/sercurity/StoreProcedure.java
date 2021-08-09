package com.example.sercurity;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StoreProcedure {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/student";
        String username = "";
        String password = "";
        Connection connection = DriverManager.getConnection(url,username, password);
        System.out.println(connection);
        // Goi StoreProcedure
        CallableStatement cs = connection.prepareCall("{call view_now}");
        ResultSet resultSet =cs.executeQuery();
        while (resultSet.next()){
            System.out.println("Name :" + resultSet.getString(2));
        }
        resultSet.close();
        cs.close();
        connection.close();
    }
}
