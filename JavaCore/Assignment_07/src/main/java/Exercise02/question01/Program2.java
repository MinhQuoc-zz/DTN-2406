package Exercise02.question01;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số a : ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào 1 số b : ");
        int b = scanner.nextInt();
        scanner.nextLine();


       try {
           System.out.println("kết quả của phép chia 2 số là :" + divide(a,b));
       }catch (Exception e){
           System.out.println("Có lỗi thực hiện chia cho số 0");
       } finally {
           System.out.println("Hoàn thành");
       }
    }
    public static float divide(int a, int b){
        return   a/b;
    }
}
