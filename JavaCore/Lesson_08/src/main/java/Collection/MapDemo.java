package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Hello" ,"Xin Chao");
        map.put("GoodBye", "Tạm biệt");
        map.put("Hello" ,"Chào");

//        System.out.println(map.get("GoodBye"));
//        System.out.println(map.keySet());
//        System.out.println(map.values());

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getClass());
        }
    }
}
