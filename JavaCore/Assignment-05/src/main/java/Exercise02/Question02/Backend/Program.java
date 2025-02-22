package Exercise02.Question02.Backend;

import Exercise02.Question02.Entity.Person;
import Exercise02.Question02.Entity.Student;

import javax.swing.*;
import java.util.Scanner;

public class Program {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("===== Menn====");
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("1. Demo person ");
            System.out.println("2. Demo Student");
            System.out.println("0. Exit ");
            System.out.println("==============");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    demoPerson();
                    break;
                case 2:
                    demoStudent();
                    break;
                case 3:
                    return;

                default:
                System.out.println("Vui lòng chọn đúng chức năng");
                    break;
            }
        }
    }
    private static void demoStudent() {
        Student student = new Student();
        student.inputInfo();
        System.out.println("Thông tin sinh viên vừa nhập là ");
        System.out.println(student.showInfo());
        if(student.hocBong()){
            System.out.println("Sinh viên này đạt học bổng ");
        }else {
            System.out.println("Sinh viên này không đạt học bổng");
        }
    }

    private static void demoPerson() {
        Person person = new Person();
        person.inputInfo();
        System.out.println("Thông tin person vừa nhập vào ");
        System.out.println(person.showInfo());
    }
}
