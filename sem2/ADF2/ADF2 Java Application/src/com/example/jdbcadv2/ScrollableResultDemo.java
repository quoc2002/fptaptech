package com.example.jdbcadv2;

import java.sql.*;

public class ScrollableResultDemo {
    public static void main(String[] args) throws Exception {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=bank";
        String username = "sa";
        String password = "sa";
        Connection conn = DriverManager.getConnection(url,username,password);
        System.out.println("Connection: "+conn);

        CallableStatement cs = conn.prepareCall("call proc_viewPersons");
        ResultSet resultSet = cs.executeQuery();
        while (resultSet.next()){
            System.out.println("Name: " + resultSet.getString(2));
        }
        System.out.println("*************************************************************");

        PreparedStatement prst = conn.prepareStatement("select * from Persons",
                ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = prst.executeQuery();
        if(rs.first())//Dong dau tien
            {
                System.out.println("Dong dau tien");
                System.out.println("Name: " + rs.getString(2));
            }
        if(rs.next())//Dong tiep theo
        {
            System.out.println("Dong tiep theo");
            System.out.println("Name: " + rs.getString(2));
        }
        if(rs.previous())//Quay ve dong dau
        {
            System.out.println("Quay lai dong dau tien");
            System.out.println("Name: " + rs.getString(2));
        }
        if(rs.relative(2))
        {
            System.out.println("2 dong tiep theo");
            System.out.println("Name: " + rs.getString(2));
        }
        if (rs.absolute(5))
        {
            System.out.println("Dong 5");
            System.out.println("Name: " + rs.getString(2));
        }

        rs.close();
        resultSet.close();
        prst.close();

    }
}
