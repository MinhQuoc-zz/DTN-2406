package Exercise01.Question04.Entity;

public class Block {
    private String name;
    private String subjects;

    public Block(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getSubjects(){
        switch (this.name){
            case "A":
                this.subjects = "Toán, Lý , Hóa";
                break;
            case "B":
                this.subjects = "Lý, Hóa, Sinh ";
                break;
            case "C":
                this.subjects = "Văn, Sử, Địa";
                break;
        }
        return this.subjects;
    }
}
