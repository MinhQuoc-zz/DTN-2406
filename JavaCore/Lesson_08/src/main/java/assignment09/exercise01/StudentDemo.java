package assignment09.exercise01;

import java.util.*;

public class StudentDemo {
    private static  List<Student> students = new ArrayList<>();
    public static void main(String[] args) {

        // Thêm sinh viên vào danh sách (3 người có tên trùng nhau)
        students.add(new Student("John"));
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("John"));
        students.add(new Student("Emma"));
        students.add(new Student("Alice"));


        // a) In ra tổng số phần tử của students
        System.out.println("Tổng số phần tử trong danh sách: " + students.size());

        // b) In danh sách sinh viên
        for (Student student : students) {
            System.out.println(student);
        }

        // c) In ra phần tử đầu và phần tử cuối của students
        if (!students.isEmpty()) {
            System.out.println("Phần tử đầu: " + students.get(0));
            System.out.println("Phần tử cuối: " + students.get(students.size() - 1));
        }

        // d) Thêm 1 phần tử vào vị trí đầu của students
        students.add(0, new Student("Michael"));

        // e) Thêm 1 phần tử vào vị trí cuối của students
        students.add(new Student("Sophia"));

        // f) Đảo ngược vị trí của students
        Collections.reverse(students);

        // In danh sách sau khi đảo ngược
        System.out.println("Danh sách sau khi đảo ngược:");
        for (Student student : students) {
            System.out.println(student);
        }

        // g) Tạo method tìm kiếm student theo id
        int searchId = 3; // Ví dụ tìm kiếm ID = 3
        Student foundStudent = findStudentById(students, searchId);
        if (foundStudent != null) {
            System.out.println("Tìm thấy sinh viên: " + foundStudent);
        } else {
            System.out.println("Không tìm thấy sinh viên với ID = " + searchId);
        }

        // h) Tạo method tìm kiếm student theo name
        String searchName = "John"; // Ví dụ tìm kiếm tên "John"
        List<Student> foundStudents = findStudentsByName(students, searchName);
        if (!foundStudents.isEmpty()) {
            System.out.println("Tìm thấy sinh viên với tên " + searchName + ":");
            for (Student student : foundStudents) {
                System.out.println(student);
            }
        } else {
            System.out.println("Không tìm thấy sinh viên với tên = " + searchName);
        }

        System.out.println("i.Tạo 1 method để in ra các student có trùng tên\n");
        findStudentSameName();
    }

    private static void findStudentSameName() {
        List<Student> tmps = new ArrayList<>();
        boolean[] isChecked = new boolean[students.size()];
        Arrays.fill(isChecked,false);

        for (int i = 0; i <students.size() -1 ; i++) {
            if(isChecked[i]) continue;
            tmps.clear();
            tmps.add(students.get(i));
            isChecked[i] = true;
            for (int j = i+1; j < students.size(); j++) {
                if (students.get(i).getName().equals(students.get(j).getName())){
                    System.out.println(students.get(i));
                    isChecked[j] = true;
                }

            }
            if(tmps.size() > 1){
                for (Student student : tmps){
                    System.out.println(student);
                }
                System.out.println("======================");
            }
        }
    }

    public static Student findStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public static List<Student> findStudentsByName(List<Student> students, String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }
        return result;
    }
    //i) Tạo 1 method để in ra các student có trùng tên

//    public static void printDuplicateStudents(List<Student> students) {
//        Map<String, Integer> nameCount = new HashMap<>();
//        for (Student student : students) {
//            nameCount.put(student.getName(), nameCount.getOrDefault(student.getName(), 0) + 1);
//        }
//
//        System.out.println("Danh sách sinh viên có tên trùng:");
//        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.println("Tên: " + entry.getKey() + ", Số lượng: " + entry.getValue());
//            }
//        }
//    }

}
