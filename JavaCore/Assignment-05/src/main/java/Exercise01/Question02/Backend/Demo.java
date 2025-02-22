package Exercise01.Question02.Backend;

import Exercise01.Question02.Entity.TuyenSinh;
import java.util.Scanner;

public class Demo {
    private TuyenSinh tuyenSinh;
    private Scanner scanner;

    public Demo(){
        scanner = new Scanner(System.in);
        tuyenSinh = new TuyenSinh();
    }
    public void question2() {
        loadMenu();

    }

    private void loadMenu() {
        while (true){
            System.out.println("=======================================================================");
            System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
            System.out.println("===              1. Insert Contestant.                              ===");
            System.out.println("===              2. View Contestant.                                ===");
            System.out.println("===              3. Find by idNum Contestant .                      ===");
            System.out.println("===              4. Exit.                                           ===");
            System.out.println("=======================================================================");
            int menuChoose = scanner.nextInt();
            switch (menuChoose) {
                case 1:
                    tuyenSinh.addContestant();
                    break;

                case 2:
                    tuyenSinh.showInfoContestant();
                    break;
                case 3:
                    System.out.println("Nhập vào ID cần tìm kiếm: ");
                    int id = scanner.nextInt();
                    tuyenSinh.findByIdNum(id);
                    break;
                case 4:
                    return;

                default:
                    System.out.println("Alarm: Lựa chọn đúng số trên menu");
                    break;
            }
        }
    }

}
