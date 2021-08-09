package com.example.jdbcadv2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLConnector {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //1. Load driver
        //connection String
        String url = "jdbc:mysql//127.0.0.1:3306";
        String username = "root";
        String password = "";
        Object o = Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement stm = conn.createStatement();
            stm.execute("create database if not exists TestDb");
            stm.execute("use TestDb");
            stm.execute("drop table if exists");
            stm.execute("create table users(" +
                    "id int not null auto_increment primary key, " +
                    "username varchar (50)," +
                    "password varchar (50))");
            //stm.executeUpdate("insert into user");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
