public class Exercise03 {
    void question01(){
        Integer salary = 5000;

        // Convert sang float
        float salaryFloat = salary.floatValue();

        // Hiển thị với 2 số sau dấu thập phân
        System.out.println("Lương: " + String.format("%.2f", salaryFloat));
    }
    void question02(){
        String number = "123456";

        int numberInt = Integer.parseInt(number);

        System.out.println("numberInt = " + numberInt);
    }
}
