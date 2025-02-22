package Exercise01.Question02.Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{

    private ArrayList<Contestant> listContestant;
    private Scanner scanner;

    public TuyenSinh(){
        listContestant = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    @Override
    public void addContestant() {
        System.out.println("Nhập vào tên thí sinh: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ thí sinh: ");
        String address = scanner.nextLine();
        System.out.println("Nhập vào mức dộ ưu tiên của thí sinh: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào thí sinh chọn các khối A, B, C: ");
        String block = scanner.next();
        Contestant contestant = new Contestant(name, address, priority, new Block(block));
        listContestant.add(contestant);
    }

    @Override
    public void showInfoContestant() {
        for (Contestant contestant : listContestant){
            System.out.println(contestant);
        }
    }

    @Override
    public void findByIdNum(int id) {
        for (Contestant contestant : listContestant){
            if(contestant.getIdNum() ==  id){
                System.out.println(contestant);
            }
        }
    }
}
