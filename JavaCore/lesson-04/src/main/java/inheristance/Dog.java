package inheristance;

public class Dog extends Animal {
    private  int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    //Ghi đè
    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }
}
