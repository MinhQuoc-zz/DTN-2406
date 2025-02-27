package Exercise02.question04;

public class Department {
    public static int COUNT = 0;
    private int id;
    private String name;

    public Department( String name) {
        super();
        this.id = ++COUNT;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
