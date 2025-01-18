public class IfElseDemo {
    public static void main(String[] args) {
        int age =25;
        if(age >= 18) {
            System.out.println("Bạn đã đủ 18 tuổi");
        }else {
            System.out.println("Bạn chưa đủ 18 tuổi");
        }
        // Kết quả = (điều kiện ) ? (trả về đúng) : (trả về sai)
        String message = age >= 18 ? "Bạn đã đủ 18 tuổi " : "bạn chưa đủ 18 tuỏi";
        System.out.println(message);
    }
}
