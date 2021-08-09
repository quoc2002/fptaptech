package json;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class WriteJSONDemo {
    public static void main(String[] args) throws Exception {
        //nv so 1
        JSONObject employee = new JSONObject();
        employee.put("firstName","Nguyen");
        employee.put("lastName","Anh Duc");
        employee.put("address","Hanoi,VN");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("fptaptech",employee);

        //nv so 2
        JSONObject employee2 = new JSONObject();
        employee2.put("firstName","Tran");
        employee2.put("lastName","Hoang Anh");
        employee2.put("address","Nghe An,VN");

        JSONObject emloyeeObject2 = new JSONObject();
        emloyeeObject2.put("fptaptech",employee2);

        //Add employee to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(emloyeeObject2);

        //Write so JSON
        FileWriter fileWriter = new FileWriter("src/json/employees.json");
        fileWriter.write(employeeList.toJSONString());
        fileWriter.flush();
    }
}
