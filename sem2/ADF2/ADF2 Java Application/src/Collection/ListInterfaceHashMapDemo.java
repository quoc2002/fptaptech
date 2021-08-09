package Collection;
import java.util.HashMap;

public class ListInterfaceHashMapDemo {
    public static void main(String[] args) {
        //Key add value pairs
        HashMap<String,Float> studentMap = new HashMap<String,Float>();
        studentMap.put("S1", 15.5f);
        studentMap.put("S2",0.5f);
        studentMap.put("S3",15f);
        studentMap.put("S4",25f);
        studentMap.put("S5",12f);

        Float mark = studentMap.get("S4");
        System.out.println(mark);
        studentMap.put("S2",25f);

        Float markS2 = studentMap.get("S2");
        System.out.println(markS2);


    }
}
