package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListInterfaceWithHasSetDemo {
    public static void main(String[] args) {

        //khoi tao 1000 phan tu se chua
        //va tan len kha nang chua la 50%
        // khong cho phep gia tri trung lap, chap nhan kieu unique
        Set<String> mySet = new HashSet<String>(100,(float) 0.5);
        mySet.add("APPLE");
        mySet.add("LG");
        mySet.add("HTC");
        mySet.add("APPLE");
        mySet.add("SAMSUNG");

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
