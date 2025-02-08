import java.time.LocalDate;

public class Program02 {
    public static void main(String[] args) {
        // khởi tạo mảng có 5 phần tử
        Account[] accounts = new Account[5];

        // dùng vòng for để khởi tạo từng phần tử
        for(int i =0; i<accounts.length;i++){
            accounts[i] = new Account(
                    "Email" + (i+1),
                    "User Name" + (i+1),
                    "full Name" + (i+1),
                    LocalDate.now()
            );
        }
        for(Account account : accounts){
            account.displayInfo();
        }
    }
}
