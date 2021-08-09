


public class UncheckedException {
    public UncheckedException(){

    }

    public static void main(String[] args) {
        int i, n = 2;
        int a[] = new int[n];

        //Declare Scanner Object named input
        java.util.Scanner input = new java.util.Scanner(System.in);

        for(i=0; i<=n; i++)
        {
            System.out.printf("a[%d] = ", i);
            a[i] = input.nextInt();
        }
        
    }
    
}
/**
 * Compile and run the test class
 * How many Exceptions may occur in the above code?
 * Please correct the above code to ve able to catch every Exception that.
 */

 /**
 * Questions:
 * Compile and run the test class.
✔ How many Exceptions may occur in the above code?
Có 1 Exception là ArrayIndexOutOfBoundsException
✔ Please correct the above code to be able to catch every Exception that.
public static void main(String[] args) {
        int i,n=2;
        int a[]=new int [n];
     Scanner input=new Scanner(System.in);
        try {
             for(i=0;i<=n;i++){
            System.out.printf("a[%d] = ",i);
            a[i] = input.nextInt();
        }
         } catch (Exception e) {
        System.out.println(e);
}

       
    }
 */