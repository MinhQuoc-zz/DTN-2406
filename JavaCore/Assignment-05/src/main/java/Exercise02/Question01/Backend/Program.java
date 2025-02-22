package Exercise02.Question01.Backend;

import Exercise02.Question01.Entity.Student;

public class Program {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Nguyễn Văn A", 1),
                new Student(2, "Nguyễn Văn B", 1),
                new Student(3, "Nguyễn Văn C", 2),
                new Student(4, "Trần Thị D", 2),
                new Student(5, "Lê Văn E", 3),
                new Student(6, "Phạm Thị F", 3),
                new Student(7, "Đặng Văn G", 1),
                new Student(8, "Hoàng Thị H", 2),
                new Student(9, "Ngô Văn I", 3),
                new Student(10, "Bùi Thị J", 1)
        };
        // gọi cả lớp điểm danh
        System.out.println("Cả lớp điểm danh");
        for(Student student : students ){
            if(student.getGroup() == 1){
                student.diemDanh();
            }
        }

        //Gọi nhom 2 đi vệ sinh
        System.out.println("Nhóm 2 đi vệ sinh: ");
        for(Student student :students){
            if(student.getGroup() == 2){
                student.diDonVeSinh();
            }
        }
        // gọi nhóm 1 đi học bài
        System.out.println("Nhóm 1 đi học bài");
        for (Student student : students){
            if(student.getGroup() == 1){
                student.hocBai();
            }
        }
    }
}
