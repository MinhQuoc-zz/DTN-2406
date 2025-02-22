package iostream;


public class Student {
    private int id;
    private String name;
    public static String COLLECT;
    public static int MONEY_GROUP;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        MONEY_GROUP +=100;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name +
                ", Collect='" + COLLECT +
                '\'' +
                '}';
    }
}

