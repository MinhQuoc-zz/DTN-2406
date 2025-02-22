package Exercise02.Question02.Entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    protected String name;
    protected Gender gender;
    protected LocalDate birthDate;
    protected String address;

    public Person(String name, Gender gender, LocalDate birthDate, String address) {
        super();
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }
    public Person(){
        super();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Person: ");
        System.out.println("Nhập tên Sinh viên: ");
        this.name = scanner.nextLine();
        System.out.println("Chọn giới tính: 1.Male 2.Female 3.Unknown");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:
                this.gender = Gender.MALE;
                break;
            case 2:
                this.gender = Gender.FEMALE;
                break;
            case 3:
                this.gender = Gender.UNKNOWN;
                break;
        }
        System.out.println("Nhập ngày sinh theo đinh dang : yyyy-MM--dd: ");
        this.birthDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
    }

    public String showInfo(){
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                '}';
    }
}
