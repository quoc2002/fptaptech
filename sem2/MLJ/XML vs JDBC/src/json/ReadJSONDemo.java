package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ReadJSONDemo {
    public static void main(String[] args) throws Exception {
        //JSON parser
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("src/json/employees.json");
        //Read JSON file
        Object object = jsonParser.parse(reader);
        JSONArray employeeList = (JSONArray) object;

        System.out.println(employeeList);

        employeeList.forEach(emp ->parseJSONObject((JSONObject) emp));
    }
    private static void parseJSONObject(JSONObject employee){
        //Get all object in JSON file
        JSONObject employeeObject = (JSONObject)employee.get("fptaptech");

        //Get firstName data
        String firstName = (String)employeeObject.get("firstName");
        System.out.println(firstName);

        //Get lastName data
        String lastName = (String)employeeObject.get("lastName");
        System.out.println(lastName);

        //Get address data
        String address = (String)employeeObject.get("address");
        System.out.println(address);
    }
}
