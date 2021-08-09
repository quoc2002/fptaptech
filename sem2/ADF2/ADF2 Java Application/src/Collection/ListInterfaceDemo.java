package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListInterfaceDemo {
    public static void main(String[] args) {
        //arraylist khai bao
        /*
        *ArrayList arrayList = new ArrayList();
        * List list = new ArrayList();
        *List<String> list1 = new ArrayList<String>();
        * */
        List<String> myList = new ArrayList<String>();
        myList.add("APPLE");
        myList.add("LG");
        myList.add("SAMSUNG");
        myList.add("NOKIA");
        myList.add("HTC");

        ListIterator<String> listIterator = myList.listIterator();
        /* String string1 = listIterator.next();//start item 1 co index =0
        System.out.println(string1);
        String string2 = listIterator.next();
        System.out.println(string2);

        String string3 = listIterator.next();
        System.out.println(string3);
        if(listIterator.hasPrevious()){
            String string = listIterator.previous();
            System.out.println(string);
        }*/

        while (listIterator.hasNext()){
            String stringValue = listIterator.next();
            System.out.println(stringValue);
        }

    }
}
