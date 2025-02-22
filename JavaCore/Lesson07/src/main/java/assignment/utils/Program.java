package assignment.utils;

import assignment.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
    question3();

    }
    public static void question3(){
        System.out.println(MyMath.min(1,100));
        System.out.println(MyMath.sum(1, 100));
    }
    public static void question1_2(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Nguyen Van A"));
        students.add(new Student(2,"Nguyen Van B"));
        students.add(new Student(3,"Nguyen Van C"));

        Student.COLLECT="Đại học bách khoa";
        students.forEach(student -> System.out.println(student));
        System.out.println("Chuyển các sinh vien này sang Đại học công nghệ ");
        Student.COLLECT="Đại học Công Nghệ";
        students.forEach(student -> System.out.println(student));

        System.out.println("Question 2");
        System.out.println("1. Các student sẽ nộp quỹ, mô Student 100k ");
        System.out.println(Student.MONEY_GROUP);

        System.out.println("B2: Student thứ 1 lấy 50k đi mua bim bim, Kẹo về liên hoan ");
        Student.MONEY_GROUP -= 50;
        System.out.println(Student.MONEY_GROUP);

        System.out.println("B3: Student thứ 2 lấy 20k đi mua bánh mì ");
        Student.MONEY_GROUP -= 20;
        System.out.println(Student.MONEY_GROUP);

        System.out.println("B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm ");
        Student.MONEY_GROUP -= 150;
        System.out.println(Student.MONEY_GROUP);

        System.out.println("   B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
        Student.MONEY_GROUP += 50 * students.size();
        System.out.println(Student.MONEY_GROUP);
    }
}
