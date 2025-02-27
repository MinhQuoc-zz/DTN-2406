package generic.entity;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Student<Integer> student1 = new Student<>(1, "A", 9);
        Student<Float> student2 = new Student<>(2, "B", 9.5f); // Sửa lỗi ở đây

        List<Student> students = new ArrayList<>();
        List<Person> personList = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        print(students);
        print(personList);
        //print(integers);
    }
    // Muốn giới hạn thì thêm extend
//    private static <T extends Number> void print(T data){
//        System.out.println(data);
//    }
    private static void print(List<? super Student > data){
        System.out.println(data);
    }
}