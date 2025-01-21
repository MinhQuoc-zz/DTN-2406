public class UnboxingDemo {
    public static void main(String[] args) {
        Integer a = 100;

        // thủ công
        int b = a.intValue();

        //auto unboxing
        int c = a;

        // Chuyển String thành int
        int d = Integer.parseInt("123456");
    }
}
