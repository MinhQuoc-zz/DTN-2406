package Exercise01_abstraction.entity;

public class Block {
    private String name;
    private String subjects;

    public Block(String block) {
        this.name = block;
    }


    public String getName() {
        return name;
    }


    public String getSubjects() {
        switch (this.name){
            case "A":
                this.subjects ="Toán , Lý , Hóa";
                break;
            case "B":
                this.subjects="Toán , Hóa, Sinh";
                break;
            case "C":
                this.subjects="Văn , Sử, Địa";
                break;
        }
        return this.subjects;
    }


}
