package assignment09.comparing.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"A",LocalDate.of(2000,3,15),8));
        students.add(new Student(2,"B",LocalDate.of(1998,8,5),6));
        students.add(new Student(3,"A",LocalDate.of(1995,12,25),8));
        students.add(new Student(4,"A",LocalDate.of(2000,3,13),9));
        students.add(new Student(5,"E",LocalDate.of(1989,7,1),6));

        System.out.println("Danh sách trước khi sắp xếp: ");
        for (Student student : students) {
            System.out.println(student);
        }
//        System.out.println("Danh sách sau khi sắp xếp theo tên");
//        Collections.sort(students);
//        for (Student student : students) {
//            System.out.println(student);
//        }
        //question02: Comparator
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getName().equals(o2.getName())){
                    if(o1.getBirthDay().equals(o2.getBirthDay())){
                        return o2.getGpa() - o1.getGpa();
                    }
                    return o1.getBirthDay().compareTo(o2.getBirthDay());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\nDanh sách sau khi sắp xếp theo tên");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
