package Collection;

import java.util.LinkedList;

public class ListInterfaceWithLinkedList {
    public static void main(String[] args) {
        //linh hoat hon Array,doi cho danh sach cac phan tu, khong bi gioi han

        //Danh sach lien ket dong -->
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("APPLE");
        myLinkedList.add("SAMSUNG");
        myLinkedList.add("NOKIA");
        System.out.println("List1: "+myLinkedList);

        myLinkedList.addFirst("XIAOMI");
        myLinkedList.addLast("LG");
        myLinkedList.add(2, "BPHONE");
        System.out.println("List2: "+myLinkedList);
        myLinkedList.remove("XIAOMI");
        //myLinkedList.removeFirst();
        myLinkedList.removeLast();
        Object listobject = myLinkedList.get(2);// dang tro vao vung o nho co index = 2
        myLinkedList.set(2,(String)listobject + "VPhone");
        System.out.println("List3: "+myLinkedList);

    }
}
