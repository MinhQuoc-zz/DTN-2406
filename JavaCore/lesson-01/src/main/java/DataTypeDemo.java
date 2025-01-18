import java.time.LocalDate;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Kiểu số nguyên
        // byte short int long
        int age =18;
        System.out.println("age = " + age);

        // kiểu số thực
        //float , double
        //giá trị mặc định 0.0
        float money = 123.456f;
        boolean isLoading = true;
        System.out.println("IsLoading " + isLoading);

        // kiểu char
        //giá trị mặc định: \u0000
        char c ='T';
        System.out.println("c = " + c);

        // kiểu string
        String s = "Nguyễn Minh Quốc";
        System.out.println("s = " + s );

        // kiểu thời gian
        // LocalDate , LocalTime , LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today" + today);
        LocalDate date = LocalDate.of(2005,9,16);
        System.out.println("date = " + date);

        // Kiểu enum
        Gender gender = Gender.FEMALE;
        System.out.println("gender = " + gender);

        // Kiểu Array
        int[] number = {2, 4, 6, 8};
        String[] fruits = new String[] {"Cam" , "Táo" , "ổi"};
        //Chỉ số bắt đầu từ 0
        System.out.println("number[0] = " + number[0]);
        int lastIndex = number.length -1;
        System.out.println("number[" + lastIndex + "] = " + number[lastIndex]);
        System.out.println("number.length = " + number.length);
    }
}
