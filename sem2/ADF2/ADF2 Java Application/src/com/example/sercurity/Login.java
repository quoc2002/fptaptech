package com.example.sercurity;


import java.sql.*;
import java.util.*;
public class Login  {

      Connection connection = Connector.getConnection();
      Scanner scanner = new Scanner(System.in);
      public Login() throws  Exception{

      }

    public static void main(String[] args) throws  Exception {
        Login login = new Login();
        login.menu();
    }

    public void menu(){
          String action ;
          while(true){
              System.out.println("\n\t ===== Welcome to Student System ===== \t");
              System.out.println("1. Register user");
              System.out.println("2. Login Statement");
              System.out.println("3. Login Prepared Statement");
              System.out.println("4. Exit");
              System.out.println("Select the operation you want to perform :");
              action = scanner.next();
              switch (action){

                  case "1":
                      addAccount();
                  case "2":
                      System.out.println("\nEnter username :");
                        String username = scanner.next();
                      System.out.println("Enter password :");
                        String password = scanner.next();
                      String message = loginStatement(username,password);
                      System.out.println(message);
                      break;

                  case "3":
                      System.out.println("\nEnter username :");
                      String user = scanner.next();
                      System.out.println("Enter password :");
                      String pass = scanner.next();
                      String status = loginPreparedStatement(user,pass);
                      System.out.println(status);
                      break;

                  case "4":
                      System.out.println("See you again !");
                      return;
                  default:
                      System.out.println("Invalid choice !");
                      continue;
              }
          }
    }

    public String loginStatement(String username, String password){
        Users users = new Users();
        users.setUsername(username);
        users.setPassword(password);
         String dbQuery = " select username from users where username = '"+users.getUsername()+"'"
                 + " and password = '" +users.getPassword()+"'";
         try{
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(dbQuery);
             while ((resultSet.next())){
                 return  " Login success !";
             }
         }catch (Exception ex){
             ex.printStackTrace();
         }
         return  "Login failed !";
    }

    public String loginPreparedStatement(String username, String password){
          Users users = new Users();
          users.setUsername(username);
          users.setPassword(password);
            String dbQuery = " select username from users where username = ? and password = ?";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(dbQuery);
                preparedStatement.setString(1,users.getUsername());
                preparedStatement.setString(2,users.getPassword());
                ResultSet resultSet = preparedStatement.executeQuery();
                while((resultSet.next())){
                    return  " Login success !";
                }
            }catch ( Exception ex){
                ex.printStackTrace();
            }
          return  " Login failed !";
    }

    public void register(Users users) throws Exception{
          Connection connection = null;
          PreparedStatement preparedStatement = null;
          try{
              Connector connector = new Connector();
              connection = connector.getConnection();
              preparedStatement = connection.prepareStatement("Insert into users values (?,?,?)");
              preparedStatement.setString(2, users.getUsername());
              preparedStatement.setString(3, users.getPassword());
              preparedStatement.executeUpdate();
          }finally {
              Connector.close(preparedStatement);
              Connector.close(connection);
          }
    }

    public void addAccount(){
          Scanner scanner = new Scanner(System.in);
          System.out.println("ID :");
          int id = scanner.nextInt();
          System.out.println("Username :");
          String username = scanner.next();
        System.out.println("Password :");
        String password = scanner.next();
        Users users = new Users();
         users.setId(id);
         users.setUsername(username);
         users.setPassword(password);
         try{
             register(users);
             System.out.println("\nCreate account success !");
         }catch (Exception ex){
             ex.printStackTrace();
         }
    }

}
