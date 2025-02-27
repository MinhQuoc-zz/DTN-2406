package assignment09.exercise01;

public class Student {
    private static int COUNT = 0;
    private  int id;
    private String name;

    public Student(String name){
        COUNT++;
        this.id =COUNT;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
