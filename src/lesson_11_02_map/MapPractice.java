package lesson_11_02_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 110);
        map.put("b", 210);
        map.put("c", 310);
        map.put("d", 410);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(110));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        Set<String> keys = map.keySet();

        System.out.println(map.remove("a", 410));
        System.out.println(map.remove("b"));
        System.out.println(map.entrySet());


        System.out.println(map.values());



        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("a", 110);
        linkedMap.put("b", 110);
        linkedMap.put("c", 110);
        linkedMap.put("d", 110);

        linkedMap.clear();
    }
}
