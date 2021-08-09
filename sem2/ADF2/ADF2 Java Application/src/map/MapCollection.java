package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {
    public static void main(String[] args) {
        Map<String,String> students = new HashMap<String, String>();

        students.put("123","Thinh");
        students.put("246","Dung");
        students.put("125","Minh");
        students.put("222","Tuan");
        students.put("t555","Anh");
        students.put("888","Chau");

        //Khong sap xep tuan tu

        System.out.println(students.get("Student222"));

        //Sap xep theo key
        Set<Map.Entry<String,String>> studentIds =students.entrySet();

        //Set<String> studentIds = students.keySet();
        for (Map.Entry studentId : studentIds){
            System.out.println(studentId.getKey() + ":" +studentId.getValue());
        }
    }
}
