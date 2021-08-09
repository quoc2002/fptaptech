





package bankingapplication;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Base64;
import java.util.UnknownFormatConversionException;




public class AccountMain {

    static String usingId = "admin";
    static String password="Admin@123";


    public static String encodePassword()
    {
        String base64encodePassword = "";

        try
        {
            base64encodePassword = Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));
            System.out.println("Base64 Encoded String (Basic) :" + base64encodePassword);
        }
        catch (UnknownFormatConversionException e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        return base64encodePassword;

    }


    public static String decodePassword()
    {

        String encodedPassword = encodePassword();
        String base64DecodedPassword = new String();

        try
        {
            byte[] decodedPassword = Base64.getDecoder().decode(encodedPassword);

            System.out.println("Original String: " + new String(decodedPassword, "utf-8"));
            base64DecodedPassword = new String(decodedPassword,"utf-8");
        }
        catch (UnknownFormatConversionException e)
        {
            System.out.println("Error :" + e.getMessage());
        }

        return base64DecodedPassword;
    }


    public static Boolean validatePassword(Account objAccount)
    {
        boolean output;
        String decodedPassword = decodePassword();
        String inputPassword = objAccount.getPassword();
        output = decodedPassword.equals(inputPassword);
        return output;

    }


    public static void main(String[] args) {
        String inPassword;
        Scanner input = new Scanner(System.in);
        Account objAccount = new Account();

        objAccount.setUserId(usingId);
        System.out.println("Enter the password:");
        inPassword = input.nextLine();
        objAccount.setPassword(inPassword);
        if (validatePassword(objAccount))
        {
            System.out.println("Admin password is successfully validated");

            System.out.println(objAccount.toString());
        }
        else
        {
            System.out.println("Invalid password");
        }
    }
}