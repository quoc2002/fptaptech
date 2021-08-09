package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortedMapCollection {
    public static void main(String[] args) {
        Map<String,String> students = new TreeMap<String, String>();
        students.put("2222","Ngoc");
        students.put("1111","Minh");
        students.put("6666","Chinh");
        students.put("3333","Trong");
        Set<String> stuIds = students.keySet();
        for (String stuId : stuIds){
            System.out.println("StudentIds:" +stuId);
        }

        Set<Map.Entry<String,String>> studentKeys = students.entrySet();
        for (Map.Entry<String,String> studentKey : studentKeys){
            System.out.println(studentKey.getKey());
        }
    }
}
