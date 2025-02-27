package innerclass.entity;

public class Student {
    private int id;
    private String name;
    private Skin skin;

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Student(int id , String name){
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, Skin skin) {
        this.id = id;
        this.name = name;
        this.skin = skin;
    }

    public class Skin{
        private String color;

        public Skin(String color){
            this.color = color;
        }
    }

}

