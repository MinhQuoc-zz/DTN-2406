package Exercise01_abstraction.entity;

public class Student {
    private int id;
    private String name;
    private String address;
    private int priority;
    private Block block;

    public static int COUNT = 0;

    public Student(String name, String address, int priority, Block block) {
        COUNT++;
        this.id = COUNT;
        this.name = name;
        this.address = address;
        this.priority = priority;
        this.block = block;
    }

    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return "Contestant [idNum=" + id + ", name=" + name + ", address=" + address + ", priority=" + priority
                + ", block=" + block.getName() + ", Subject =" + block.getSubjects() + "]";
    }

}
