package CollectionFramework.Map;

import java.util.HashMap;

public class Hashmapps {
    public static void main(String[] args) {

        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("India", "New Delhi");
        map1.put("Australia", "Canberra");
        map1.put("England", "London");
        map1.put("Bulgaria", "Sofia");

        //System.out.println(map1);
        System.out.println(map1.get("Australia"));
    }
}
