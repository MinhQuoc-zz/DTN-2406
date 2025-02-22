package assignment.demo;

public class Student {
    private int id;
    private String name;

    public static int COUNT;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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
    public static void show(){
        System.out.println("Show...");
    }
    public static void run(){
        show();
        System.out.println(COUNT + "Running...");
    }
    public void jump(){
        System.out.println("Jumping");
    }
}
