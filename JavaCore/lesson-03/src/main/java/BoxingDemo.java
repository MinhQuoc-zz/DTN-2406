public class BoxingDemo {
    public static void main(String[] args) {
        int a =100;

        // Thủ công
        Integer b = Integer.valueOf(a);

        // Auto boxing
         Integer c =a;
         // Chuyển String thanh Interger
        Integer d = Integer.valueOf("12345");
    }
}
