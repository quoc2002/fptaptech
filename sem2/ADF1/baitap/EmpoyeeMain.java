import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jdk.internal.org.jline.utils.InputStreamReader;
import jdk.javadoc.internal.doclets.formats.html.resources.standard;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class EmpoyeeMain {
    public static void main(String[] args){
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         Map<String, LocalDate> hm = new HashMap<String , LocalDate>();
         System.out.println("enter the total number of employees");
         int size = Integer.parseInt(input.readLine());
         for (int i = 0; i< size;i++){
             System.out.println("enter the employee ID");
             String empId = input.readLine();
             System.out.println("Enter the date of brith in this format dd/mm/yyy");
             String atrDOB = input.readLine();
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyy");
             LocalDate dob = LocalDate.parse(strDOB,formatter);
             hm.put(empId,dob);

         }
         retirementList(hm);

        } catch(IOException ex)
        {
          System.out.println(ex.getMessage());
        }
        
    }
    public static void  retirementList(Map<String, LocalDate>hm){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyy");
        System.out.println("current date is :"+currentDate.format(formatter));
        LocalDate dateOfBirth;
        String empId;
        List<String> list = new ArrayList<String>();
        System.out.println("retirement List");

        for(Map.Entry<String, LocalDate> me : hm.entrySet());{
            empId = me.getKey();
            dateOfBirth = me.getValue();
            Period diff = Period.between(dateOfBirth, currentDate);
            int diff1 = Period.between(dateOfBirth, currentDate).getYears();
            int dif4 = 66 -(int) diff1;
            int diff2 = Period.between(dateOfBirth, currentDate).getMonths();
            int dif6 = 12 -diff2;
            int age= diff.getYears();
            if(age>66){
                list.add(empId);
                System.out.println("emp id:" +empId + "has" +dif4+"years"+dif6+"months for retirement");
            }
        }
    }
}

