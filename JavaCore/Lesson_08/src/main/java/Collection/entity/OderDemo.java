package Collection.entity;

import java.time.LocalDate;
import java.util.*;

public class OderDemo {
    public static void main(String[] args) {
       List<Student> students = new ArrayList<>();
       students.add(new Student(1,"A",LocalDate.of(2000,1,15),8));
       students.add(new Student(2,"B",LocalDate.of(2002,3,5),6));
       students.add(new Student(3,"C",LocalDate.of(2004,5,25),6));
       students.add(new Student(4,"D",LocalDate.of(2003,12,13),9));
       students.add(new Student(5,"B",LocalDate.of(2003,9,1),3));

        System.out.println("Danh sách sinh viên trước khi sắp xếp:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sắp xếp danh sách sinh viên theo tên, ngày sinh, điểm
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int nameComparison = o1.getName().compareTo(o2.getName());
                if (nameComparison != 0) {
                    return nameComparison;
                }

                int birthDayComparison = o1.getBirthDay().compareTo(o2.getBirthDay());
                if (birthDayComparison != 0) {
                    return birthDayComparison;
                }

                return o1.getGpa() - o2.getGpa();
            }
        });

        // In danh sách sinh viên sau khi sắp xếp
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
