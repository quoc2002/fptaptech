import java.util.Scanner;

public class Assignment5{
   
    public static void step1(){
        int n;
        Scanner input = new Scanner(System.in);
           
        
               System.out.print("How many times do you attemp this test  :");
                n = input.nextInt();
                if(n>1){
                    System.out.println("You have exceeded the specified number of times !");
                    return ;
                }
                else if(n==0 || n==1){
                   
                    menu();
                }
                else{
                    System.out.println("\nThe number is incorrected !");
                    
                }
           
    }
      

     public static void aptitude(){
       
         
          
     }

     public static void english(int count1){
        Scanner input = new Scanner(System.in);
       

        String result1;
        System.out.print(" Where can you always find the money ?");
         result1 = input.next();
         if(result1 == "In the dictionary" ){
             System.out.println("Amazing !!");
             count1++;
         }
         else{
            System.out.println("Incorrect :< ");
         }  
    }

    public static void math(){
         
    }

    public static void gk(){
         
    }


    public static void menu(){
        int sum =0;
        int total = 0;
        while(true){
            System.out.println("\t\t ===== List of Subjects =====");
            System.out.println("\n\t\t\t1, Aptitude");
            System.out.println("\n\t\t\t2, English");
            System.out.println("\n\t\t\t3, Math");
            System.out.println("\n\t\t\t4, GK");
            System.out.println("\n\t\t\t5, Exit");
            int choice;
            Scanner input = new Scanner(System.in);
               
                   System.out.print("Enter your choice  :");
                    choice = input.nextInt();
            
            switch(choice){
                case 1:
                // Kiem tra Aptitude
                aptitude();
                break;

                case 2:
                // Kiem tra English
                english(3);// ko khai bao dc count1
                break;

                case 3:
                // Kiem tra Math
                break;

                case 4:
                // Kiem tra GK
                break;

                case 5:
                System.out.println("Congratulation !! You have finished your test .");
                System.exit(0);
                break;

                default:
                System.out.println("The number is incorrected. Please enter again !");
                break;
            }
            
        }
              // sum = count + count1 + count2 + ;  // Tinh tong so cau lam dung
             /* sum = sum*10;                          // Tong diem dat dc
               if(sum < 20){
                   total = sum;
               }
               else if(sum>=20 && sum<30){
                   total = sum + 2;
               }
               else if(sum>=30 && sum<40){
                   total = sum +5;
               }
               else{
                   total = sum + 10;
               }



               // Display judgement
               if(total >=40){
                   System.out.println("You are a genius !");
               }
               else if(total >=30 && total <40){
                   System.out.println("You are intelligent !");
               }
               else if(total >=20 && total <30){
                   System.out.println("Your IQ level is average !");
               }
              else if(total >=10 && total <20){
                   System.out.println("Your IQ level is below average !");
               }
               else{
                   System.out.println("You need to re-appear the test !");
               }
               */
    }
    public static void main(String[] args){
       
        step1();
        menu();
    
    }
}
/* Thieu sot : Cau hoi cho cac phan
               Hoan thanh xong tat ca cac test moi co the Exit */