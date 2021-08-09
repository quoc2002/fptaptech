/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

/**
 *
 * @author thdat
 */
public class Account {

    //Create private  fields
    private String userId;
    private String password;

    //Create getter and setter methods
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account() {}
    @Override
    public String toString() { //override the inherited toString() method to display user id and password
        return "Account{" + "userId=" + userId + ", password=" + password + '}';
    }

}
