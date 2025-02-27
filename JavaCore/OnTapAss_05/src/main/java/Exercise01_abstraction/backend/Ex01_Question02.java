package Exercise01_abstraction.backend;

import Exercise01_abstraction.entity.TuyenSinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01_Question02 {
    private Scanner scanner;
    private TuyenSinh tuyenSinhs;

    public Ex01_Question02(){
        scanner = new Scanner(System.in);
        tuyenSinhs = new TuyenSinh();

    }
    public void question_02(){
        loadMenu();
    }

    private void loadMenu() {
        while (true){
            System.out.println("============Menu==================");
            System.out.println("Lựa chọn chức năng: ");
            System.out.println("1. Insert Student");
            System.out.println("2. View Student");
            System.out.println("3. Find by Id");
            System.out.println("0. Exit");
            System.out.println("====================================");

            int menuChoose = scanner.nextInt();
            scanner.nextLine();
            switch (menuChoose){
                case 1:
                    tuyenSinhs.addStudent();
                    break;
                case 2:
                    tuyenSinhs.showInfoStudent();
                    break;
                case 3:
                    System.out.println("Nhập id cần tìm kiếm: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    tuyenSinhs.findById(id);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Mời chọn đúng chức năng");
                    break;
            }
        }
    }
}
