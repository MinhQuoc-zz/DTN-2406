package Exercise02.Quetion03.BackEnd;

import Exercise02.Quetion03.Entity.HinhVuong;

import java.util.Scanner;

public class Program03 {
    private static Scanner scanner = new Scanner(System.in);
    private static HinhVuong hinhVuong;
    public static void main(String[] args) {
        while (true){
            System.out.println("==========Lựa chọn chức năng==========");
            System.out.println("          1. Tạo hình vuông           ");
            System.out.println("          2. Tính chu vi              ");
            System.out.println("          3. Tính diện tích           ");
            System.out.println("          0. Thoát                    ");
            System.out.println("======================================");
            int menuChoose = scanner.nextInt();
            switch (menuChoose){
                case 1:
                    System.out.println("Nhập vào cạnh hình vuông: ");
                    float a = scanner.nextFloat();
                    hinhVuong = new HinhVuong(a);
                    System.out.println("Bạn vừa tạo thành công hình vuông có cạnh là: " + a);
                    break;
                case 2:
                    System.out.println("Chu vi hình vuông là: " + hinhVuong.TinhChuVi());
                    break;
                case 3:
                    System.out.println("Diện tích hình vuông là: " + hinhVuong.TinhDienTich());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn đúng số trên menu");
                    break;

            }
        }
    }
}
