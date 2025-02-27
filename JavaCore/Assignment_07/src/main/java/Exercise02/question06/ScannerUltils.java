package Exercise02.question06;

import java.util.Scanner;

public class ScannerUltils {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(){
        boolean validInput = false;
        while (!validInput){
            try {
                System.out.println("Nhập vào 1 số bất kỳ: ");
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < 0) {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                } else {
                    validInput = true;
                    return number;
                }
            }catch (Exception e){
                System.out.println("Wrong inputing! Please input an age as int, input again.");
                scanner.next(); // Clear the invalid input from the buffer
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int age = inputInt();
        System.out.println("Your age is: " + age);
    }
}

