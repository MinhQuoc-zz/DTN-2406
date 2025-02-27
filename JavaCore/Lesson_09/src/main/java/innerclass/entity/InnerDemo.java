package innerclass.entity;

public class InnerDemo {
    public static void main(String[] args) {
        Student student = new Student(1,"A");
        Student.Skin skin1 = student.new Skin("Red");
        Student.Skin skin2 = student.new Skin("White");
        Student.Skin skin3 = student.new Skin("White");

        student.setSkin(skin1);

    }
}
