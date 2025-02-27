package assignment.entity;

import java.util.*;

public class Program {
    private static  List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        question1_1();

    }

    private static void question1_1() {

        students.add(new Student("A"));
        students.add(new Student("B"));
        students.add(new Student("C"));
        students.add(new Student("D"));
        students.add(new Student("A"));
        students.add(new Student("A"));
        students.add(new Student("D"));
        students.add(new Student("C"));

        System.out.println("a) In ra tổng số phần tử của students");
        System.out.println(students.size());

        System.out.println("b) Lấy phần tử thứ 4 của students");
        System.out.println(students.get(3));

        System.out.println("c) In ra phần tử đầu và phần tử cuối của students");
        System.out.println(students.getFirst());
        System.out.println(students.get(students.size()-1));

        System.out.println("d) Thêm 1 phần tử vào vị trí đầu của students");
        students.add(0,new Student("E"));
        System.out.println(students);

        System.out.println("e) Thêm 1 phần tử vào vị trí cuối của students");
        students.add(new Student("H"));
        System.out.println(students);

//        System.out.println("f) Đảo ngược vị trí của students");
//        List<Student> reverStudent = new ArrayList<>();
//        for (int i = students.size()-1; i >= 0 ; i--) {
//            reverStudent.add(students.get(i));
//        }
//        System.out.println(reverStudent);

//        Collections.reverse(students);
//        System.out.println(students);

//        System.out.println("g) Tạo 1 method tìm kiếm student theo id");
//        Student rsSearchId = findStudentById(5);
//        if(rsSearchId == null){
//            System.out.println("Không tìm thấy student ");
//        }else {
//            System.out.println(rsSearchId);
//        }
//
//        System.out.println("g) Tạo 1 method tìm kiếm student theo name ");
//        Student studentByName = findStudentByName();
//
//        System.out.println("i) Tạo 1 method để in ra các student có trùng tên");
//        printDuplicateStudentNames();

        System.out.println(" Xóa name của student có id = 2");
        for(Student student : students){
            if(student.getId() == 2){
                student.setName(null);
                break;
            }
        }
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getId() == 2) {
//                students.remove(i);
//                break; // Dừng vòng lặp sau khi xóa
//            }
//        }
//        System.out.println("Danh sách sau khi xóa:");
//        for (Student student : students) {
//            System.out.println(student);
//        }

        System.out.println("k) Delete student có id = 5");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == 5) {
                students.remove(i);
                break; // Dừng vòng lặp sau khi xóa
            }
        }
        System.out.println("Danh sách sau khi xóa:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies");
        System.out.println("Danh sách studentCopies");
        List<Student> studentCopies = new ArrayList<>();
        studentCopies.addAll(students);
        System.out.println(studentCopies);
        students.remove(1);
        System.out.println(studentCopies);


    }
//
//    private static void printDuplicateStudentNames() {
//
//    }

//    private static void printDuplicateStudentNames() {
//       Map<String,Integer> nameCount = new HashMap<>();
//
//       //Đếm số lần xuất hiện của mỗi tên
//        for (Student student : students) {
//            String name = student.getName();
//            nameCount.put(name,nameCount.getOrDefault(name,0)+ 1);
//        }
//        // In ra các tên xuất hiện nhiều hơn một lần
//        System.out.println("Các student có trùng tên:");
//        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey() + " (" + entry.getValue() + " lần)");
//            }
//        }
//    }

    private static Student findStudentByName() {
        boolean found = false;
        System.out.println("Nhập tên của student cần tìm kiếm: ");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().equals(name)){
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy student nào có tên: " + name);
        }
        return null;
    }


    private static Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
            return null;
        }


//    public static void findById(){
//        System.out.println("Nhập id cần tìm kiếm: ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        for (Student student : students){
//            if(student.getId() == id){
//                System.out.println(student);
//            }
//        }
//    }

    }