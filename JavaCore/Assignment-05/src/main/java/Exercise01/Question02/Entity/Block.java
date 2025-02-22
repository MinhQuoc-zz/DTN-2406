package Exercise01.Question02.Entity;

public class Block {
    private String name;
    private String subject;

    public Block(String name) {
        this.name = name;
        this.subject = subject;
    }



    public String getName() {
        return name;
    }

    public String getSubject() {
        switch (this.name){
            case "A":
                this.subject = "Toán , lý , hóa";
                break;
            case "B":
                this.subject = "Toán , hóa , sinh";
                break;
            case "C":
                this.subject = "Văn , sử , địa";
                break;
        }
        return this.subject;
    }
}
