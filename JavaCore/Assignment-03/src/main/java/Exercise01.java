import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.round;

public class Exercise01 {
    //Exercise-01
    void question01() {
         float account01_salary = 5240.6f;
         float account02_salary = 10970.055f;

        int rounded_account1_salary =(int)round(account01_salary);
        System.out.println(rounded_account1_salary);
    }
    void question02(){
        Random random = new Random();
        int randomNumber = random.nextInt(100000);

        // định dạng số thành chuỗi 5 chữ số
        String formatNumber = String.format("%05d", randomNumber);

        System.out.println("randomNumber = " + randomNumber);
    }

    void question03(){
        Random random = new Random();
        int randomNumber = random.nextInt(100000);

        int number = randomNumber%100;
        System.out.println("randomNumber = " + randomNumber);
        System.out.println("number = " + number);
    }
    void question04(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên a : ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số nguyên b : ");
        int b = scanner.nextInt();

        System.out.println("Thương của a và b là : " + (float)a/b);
    }
}
