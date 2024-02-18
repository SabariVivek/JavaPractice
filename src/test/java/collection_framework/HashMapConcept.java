package collection_framework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String[] args) {

        Map<Object, Object> map = new LinkedHashMap<>();

        // Adding a value...
        map.put("Username", "Sabari Vivek");
        map.put("Password", "Sabari@123");
        map.put("Location", "Chennai");
        map.put("Experience", "10 Years");
        map.put(null, "10 Years"); // Declaration...
        map.put(null, "20 Years"); // Update...
        System.out.println(map);

        // Adding whole map to a exisiting one...
        Map newMap = new HashMap();
        newMap.put("Color", "Blue");
        newMap.put("Company", "HP");
        newMap.put("Road", "ABCD");

        // Adding whole list to the collection...
        map.putAll(newMap);

        // Retriving a value...
        System.out.println(map.get("Location"));

        // Removing a value...
        map.remove("Color");
        System.out.println(map);

        // Checking whether the key is there or not...
        System.out.println(map.containsKey("Username"));

        // Checking whether the value is there or not...
        System.out.println(map.containsValue("HP"));

        // Checking empty or not...
        System.out.println(map.isEmpty());

        // Checking the size...
        System.out.println(map.size());

        // Clearing all the values
        newMap.clear();
        System.out.println(newMap);

        // Entry Set (Interface)...
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (Object obj : map.entrySet()) {
            System.out.println(obj);
        }
    }
}