package assignment09.exercise01.question2;
import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1 ,"Nguyễn Văn Nam");
        map.put(2, "Nguyễn Văn Huyên");
        map.put(3 ,"Trần Văn Nam");
        map.put(4 ,"Nguyễn Văn A");

        // In ra thông tin sinh viên từ Map
        System.out.println("Thông tin sinh viên trong Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("Các cặp key của map" );
        for(Integer key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("Các value của Map:");
        for (String value : map.values()) {
            System.out.println(value);
    }
}}
