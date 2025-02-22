package Exercise02.Question02.Entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person {
    private int id;
    private  float avg;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    @Override
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Nhập mã sinh viên: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập điểm trung bình của sinh viên: ");
        this.avg = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Nhập email: ");
        this.email = scanner.nextLine();
        System.out.println("Nhập thông tin sinh viên thành công");
    }


    @Override
    public String showInfo() {
        return super.showInfo()  +
                "id=" + id +
                ", avg=" + avg +
                ", email" + email +
                '}';

    }
    public boolean hocBong(){
        return avg > 8.0 ? true : false;
    }
}
