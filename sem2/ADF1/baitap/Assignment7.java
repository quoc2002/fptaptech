
import java.util.Scanner;
public class Assignment7 {

    private String username;
    private String password;
    private String designation;

 

  public  void validate(String username, String password ){
      // Check valid username
      this.username = username;
      this.password = password;
      do{
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter your Username :");
       
        username = input.next();
 
        if(username.length() <= 5 || username.length() >=30){
               System.out.println("\nUsername is invalided !");
        }
      }while(username.length() <= 5 || username.length() >=30);


      // Check valid password
      do{
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter your Password :");
        password = input.next();
 
        if(password.length() <= 5 || password.length() >=30){
               System.out.println("\nPassword is invalided !");
        }
      }while(password.length() <= 5 || password.length() >=30);

  }

    public  void main(String[] args){
         validate(username, password);
         System.out.println("\nSign in successfully !!");
    }
    
}
