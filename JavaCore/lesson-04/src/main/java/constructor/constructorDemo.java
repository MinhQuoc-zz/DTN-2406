package constructor;

public class constructorDemo {
    public static void main(String[] args) {
        //Tao ra 1 doi tuong tu 1 class
        // Hàm khởi tạo
        // 1.Tên giống với tên class
        // 2. không có kiểu trả về
        // Chú ý: Mặc định constructor 0 tham số
        Dog dog = new Dog("ABS", 3);
        System.out.println(dog);
    }
}
