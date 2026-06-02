package com.example.javas.jeevan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RemoveMatchingStringFromMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jay");
        map.put(2, "jeevan");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            if ("jeevan".equals(entry.getValue())) {
                map.remove(entry.getKey());// it will not throw the CME bcoz removing current entry from map
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
        // best way Iterate hashmap
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            if ("jeevan".equalsIgnoreCase(entry.getValue())) {
                itr.remove();
            }
        }
    }
}
