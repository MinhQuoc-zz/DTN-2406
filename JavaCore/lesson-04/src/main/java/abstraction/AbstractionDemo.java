package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        //Tính trừu tượng
        //abstract class : không thể khởi tạo đối tượng
        //abstract method: Không có thân hàm
        //Animal animal = new Animal();
        Dog dog = new Dog();
        dog.makeSound();
    }
}
