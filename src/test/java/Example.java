import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Example {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src/main/resources/Testrail.json"));
        JSONArray json = (JSONArray) obj;
        List<String> list = JsonPath.read(json, "$..id");
        System.out.println(list);
    }

}
