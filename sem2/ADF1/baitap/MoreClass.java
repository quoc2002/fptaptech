


public class MoreClass {

    public static void main(String[] args) {
        Object obj1 = new Object();
        System.out.println(obj1);

        Object obj2 = new Object(){
            public String toString(){
                return "this is obj2";
            }
        };
        System.out.println(obj2);
    }
    
}



/**
 * Compile and run the test class has written
 * Why System.out.println(obj1) ; could be displayer?
 * what's the difference between two objects obj1 and obj2?
 */

/**
* Questions:
 * Compile and run the test class has written.
 Why System.out.println(obj1); could be displayed?
 * Vì obj1 được gọi lag 1 đối tượng và ko được gắn giá trị.
 * What's the difference between two objects obj1 and obj2?
 Đối tượng obj2 có 1 method là toString còn dối tượng obj1 ko có method nào vả.
*/