package Collection;

import java.util.Vector;
public class ListVector {
    public static void main(String[] args) {
        //Vector<String> vector = new Vector<String>();
        Vector<Integer> vector = new Vector<Integer>(100, 20);
        vector.add(5);
        vector.add(256);
        vector.add(156);
        vector.add(new Integer(25));
        vector.add(null);

        System.out.println(vector.size());
        vector.setElementAt(5000, 1);
        System.out.println(vector.get(1));
    }
}
