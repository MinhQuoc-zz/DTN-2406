package iostream;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) {
//        Student student = new Student(1,"NVA");
//
//        try (FileOutputStream fileOutputStream = new FileOutputStream(  "student.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try (FileInputStream fileInputStream = new FileInputStream(  "student.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
           Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (Exception exception) {
            exception.printStackTrace();

        }
    }
}
