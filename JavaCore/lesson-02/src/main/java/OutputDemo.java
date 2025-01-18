public class OutputDemo {
    public static void main(String[] args) {
        // Escape character
        // \" , \' , \\ , \n , \t
        System.out.println("\"Quốc\"");

        //System.out.print("");

        //System.out.printf();
        // %d: số nguyên
        // %f: số thực
        // &s: string
        // %b: boolean
        // %c: char
        // %n: xuống dòng
        String name = "Quốc";
        int age = 21;
        System.out.println("Tôi tên là " + name + ", Tuổi " + age );
        System.out.printf("Tôi tên là : %s , Tuổi %d %n",name,age);

        // %,d: Gom nhóm 3 số
        System.out.printf("Tiền: %,d%n",1000000000);

        // %.2f: Làm tròn 2 chữ số
        System.out.printf("Điểm: %,.2f%n",12345.6789);
        // %10s
        System.out.printf("Học phần: %10s%n","Java");

        // vd: In ra định dạng bảng
        // VD: In ra định dạng bảng
        System.out.println("+------+--------------------+");
        System.out.printf("| %-4s | %-18s |%n", "ID", "NAME");
        System.out.println("+------+--------------------+");
        System.out.printf("| %-4s | %-18s |%n", "1", "Nguyễn Văn Khoa");
        System.out.println("+------+--------------------+");
        System.out.printf("| %-4s | %-18s |%n", "2", "Lê Thu Hà");
        System.out.println("+------+--------------------+");
    }
}
