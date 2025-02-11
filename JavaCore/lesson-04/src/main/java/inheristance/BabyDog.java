package inheristance;

public class BabyDog extends Dog{
    public BabyDog(String name, int age) {
        super(name, age);
    }
    public void abc(){
        super.eat();
        super.max(2, 6);
    }
}
