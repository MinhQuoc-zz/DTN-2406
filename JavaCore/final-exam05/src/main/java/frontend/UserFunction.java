package frontend;

import entity.User;
import lombok.AllArgsConstructor;
import repository.UserRepository;
import util.ScannerUtil;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository repository;
        public void findById() throws SQLException, IOException {
            System.out.println("Mời bạn nhập vào thông tin cần tìm kiếm: ");
            System.out.println("Nhập vào id: ");
            int id = ScannerUtil.inputInt();
            User user = repository.findById(id);

            System.out.println("+------+--------------------+--------------------+--------------------+");
            System.out.println("|  ID  |     FULL NAME      |       EMAIL        |     EXP_IN_YEAR    |");
            System.out.println("+------+--------------------+--------------------+--------------------+");
            if(user == null ){
                System.out.printf("| %-4s | %-18s | %-18s | %-18s |%n",
                        "NULL","NULL","NULL","NULL");
                System.out.println("+------+--------------------+--------------------+--------------------+");
            }else {

                String fullName = user.getFullName();
                String email = user.getEmail();
                int expInYear = user.getExpInYear();
                System.out.printf("| %-4s | %-18s | %-18s | %-18s |%n", id, fullName,email,expInYear);
                System.out.println("+------+--------------------+--------------------+--------------------+");

            }
        }

        public void findAll() throws SQLException, IOException {
            List<User> users = repository.findAll();
            System.out.println("Danh sách student: ");
            System.out.println("+------+--------------------+--------------------+--------------------+");
            System.out.println("|  ID  |     FULL NAME      |       EMAIL        |     EXP_IN_YEAR    |");
            System.out.println("+------+--------------------+--------------------+--------------------+");
            if(users.isEmpty() ){
                System.out.printf("| %-4s | %-18s | %-18s | %-18s |%n",
                        "NULL","NULL","NULL","NULL");
                System.out.println("+------+--------------------+--------------------+--------------------+");
            }else {
                for (User user : users) {
                    int id = user.getId();
                    String fullName = user.getFullName();
                    String email = user.getEmail();
                    String major = user.getMajor();
                    System.out.printf("| %-4s | %-18s | %-18s | %-18s |%n", id, fullName,email,major);
                    System.out.println("+------+--------------------+--------------------+--------------------+");
                }


            }
        }
}
