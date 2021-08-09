package Collection;
import java.util.LinkedList;
import  java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("BPHONE");
        queue.add("APPLE");
        queue.add("SONY");
        queue.add("SAMSUNG");
        queue.add("NOKIA");
        queue.add("LG");
        while (true){
            String value = queue.poll();
            if (value==null) break;
            System.out.println(value);

        }
    }

}
