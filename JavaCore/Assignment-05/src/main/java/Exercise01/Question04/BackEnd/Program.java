package Exercise01.Question04.BackEnd;

import Exercise01.Question04.Entity.TuyenSinh;

import java.util.Scanner;

public class Program {
    private static TuyenSinh tuyenSinh = new TuyenSinh();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("====Lựa chọn chuc năng của bạn====");
            System.out.println("1. Insert contestant              ");
            System.out.println("2. View list contestant           ");
            System.out.println("3. Find by idNum                  ");
            System.out.println("0. Exit                           ");
            System.out.println("==================================");
            int menuChoose = scanner.nextInt();
            scanner.nextLine();
            switch (menuChoose){
                case 1:
                    tuyenSinh.addContestant();
                    break;
                case 2:
                    tuyenSinh.showInfoContestant();
                    break;
                case 3:
                    System.out.println("Nhập id bạn muốn tìm kiếm");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    tuyenSinh.findIdNum(id);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Mời bạn nhập đúng lựa chọn ");
                    break;
            }
        }
    }
}
