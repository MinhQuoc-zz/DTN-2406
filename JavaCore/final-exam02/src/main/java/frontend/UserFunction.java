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

    public void findAll() throws SQLException, IOException {
        List<User> users = repository.findAll();
        System.out.println("Danh sách user:");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID |    FULL NAME        |   EMAIL            |");
        System.out.println("+------+--------------------+--------------------+");

        //kiểm tra danh sách có rỗng không
        if(users.isEmpty()){
            System.out.printf("| %-4s | %-18s | %-18s |%n",          "NULL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+");
        }else {
            for (User user : users) {
                int id = user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();
                System.out.printf("| %-4s | %-18s | %-18s |%n",          id,fullName,email);
                System.out.println("+------+--------------------+--------------------+");
            }
        }
    }

    public void findById() throws SQLException, IOException {
        System.out.println("Mời bạn nhập thông tin user: ");
        System.out.println("Nhập id: ");
        int id = ScannerUtil.inputInt();
        User user = repository.findById(id);
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID |    FULL NAME        |   EMAIL            |");
        System.out.println("+------+--------------------+--------------------+");
        if(user == null){
            System.out.printf("| %-4s | %-18s | %-18s |%n",          "NULL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+");
        }else {

                String fullName = user.getFullName();
                String email = user.getEmail();
                System.out.printf("| %-4s | %-18s | %-18s |%n",          id,fullName,email);
                System.out.println("+------+--------------------+--------------------+");
            }
    }

    public void findByEmailAndPassword() throws SQLException, IOException {
        System.out.println("Mời bạn nhập thông tin user: ");
        System.out.println("Nhập email: ");
        String email = ScannerUtil.inputString();
        System.out.println("Nhập password: ");
        String password = ScannerUtil.inputString();

        User user = repository.findByEmailAndPassword(email,password);
        if(user == null){
            System.out.println("Đăng nhập thất bại ");
        }else {
            String fullName = user.getFullName();
            User.Role role = user.getRole();
            System.out.printf("Đăng nhập thành công : %s - %s%n",fullName,role);
        }
    }
    public void create() throws SQLException, IOException {
        System.out.println("Mời bạn nhập vào thông tin users ");
        System.out.println("Nhập vào full name: ");
        String fullName = ScannerUtil.inputString();
        System.out.println("Mời bạn nhập email" );
        String email = ScannerUtil.inputString();
        int result = repository.create(fullName,email);
        System.out.printf("Tạo thành công %d user(s).%n", result);
    }

    public void delete() throws SQLException, IOException {
        System.out.println("Mời bạn nhập user cần xóa:");
        System.out.println("Nhập id: ");
        int id = ScannerUtil.inputInt();
        int result = repository.deleteById(id);
        System.out.printf("Xóa user có id %d thành công ", id);
    }
}
