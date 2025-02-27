package generic.entity;

public class Student<T> extends Person { // Thêm <T> vào định nghĩa lớp Student
    private int id;
    private String name;
    private T gpa;


    public Student(int id, String name, T gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getGpa() {
        return gpa;
    }

    public void setGpa(T gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}