package Exercise01.Question02.Entity;

public class Contestant {
    public static int Count = 0;
    private int idNum;
    private String name;
    private String address;
    private int priority;
    private Block block;

    public int getIdNum(){
        return idNum;
    }

    public Contestant(String name, String address, int priority, Block block) {
        this.idNum = idNum;
        this.name = name;
        this.address = address;
        this.priority = priority;
        this.block = block;
    }

    @Override
    public String toString() {
        return "Contestant{" +
                "idNum=" + idNum +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                ", block=" + block.getName() + ", Subject =" + block.getSubject() + "]";

    }
}
