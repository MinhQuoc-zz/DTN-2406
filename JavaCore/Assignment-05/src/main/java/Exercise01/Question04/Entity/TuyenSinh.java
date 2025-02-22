package Exercise01.Question04.Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    private ArrayList<Contestant> listContestants = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void addContestant() {
        System.out.println("Nhập vào tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập vào mức độ ưu tiên: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào khối thí sinh chọn khối A, B , C: ");
        String block = scanner.nextLine();
        Contestant contestant = new Contestant(name,address, priority, new Block(block));
        listContestants.add(contestant);
    }

    @Override
    public void showInfoContestant() {
    for(Contestant contestant : listContestants){
        System.out.println(contestant);
    }
    }

    @Override
    public void findIdNum(int id) {
    for (Contestant contestant : listContestants){
        if(contestant.getIdNum() == id){
            System.out.println(contestant);
        }
    }
    }
}
