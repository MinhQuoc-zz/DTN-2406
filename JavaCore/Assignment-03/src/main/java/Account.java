import java.time.LocalDate;

public class Account {
    String email;
    String userName;
    String fullName;
    LocalDate createDate;

    public Account(String email, String userName, String fullName, LocalDate createDate) {
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.createDate = createDate;
    }

    // phương thức hiển thị thông tin
    public void displayInfo(){
        System.out.println("email = " + email);
        System.out.println("userName = " + userName);
        System.out.println("fullName = " + fullName);
        System.out.println("createDate = " + createDate);
        System.out.println("-------------------------------");
    }
}
