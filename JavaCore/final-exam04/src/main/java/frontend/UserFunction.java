package frontend;

import controller.UserController;
import entity.User;
import lombok.AllArgsConstructor;
import repository.UserRepository;
import util.JdbcUtil;
import util.ScannerUtil;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.SortedMap;

@AllArgsConstructor
public class UserFunction {
    private UserController controller;

    public void showMenu() throws SQLException, IOException {
       while (true){
           System.out.println("Mời lựa chọn chức năng:");
           System.out.println("1. Đăng nhâp");
           System.out.println("2. Hiển thị danh sách user");
           System.out.println("3. Tìm kiếm user theo id");
           System.out.println("0. thoát khoi chương trình");

           int menu = ScannerUtil.inputInt();
           switch (menu){
               case 1:
                   findByEmailAndPassword();
                   break;
               case 2:
                   findAll();
               case 3:
                   findById();
               case 0:
                   return;
               default:
                   System.out.println("Mời lựa chọn lại chưức năng");
                   break;

           }
       }
    }

    private void showAdminMenu() throws SQLException, IOException {
        while (true){
            System.out.println("Mời lựa chọn chức năng:");
            System.out.println("1. Thoát");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo id");
            System.out.println("4. Thêm user");
            System.out.println("5. Xóa user theo id");

            int menu = ScannerUtil.inputInt();
            switch (menu){
                case 1:
                    return;
                case 2:
                    findAll();
                    break;
                case 3:
                    findById();
                    break;
                case 4:
                    create();
                    break;
                case 5:
                    deleteById();
                    break;
                default:
                    System.out.println("Mời lựa chọn lại chưức năng");
                    break;

            }
        }
    }
    public void showEmployeeMenu() throws SQLException, IOException {
        while (true){
            System.out.println("Mời lựa chọn chức năng:");
            System.out.println("1. Thoát");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo id");


            int menu = ScannerUtil.inputInt();
            switch (menu){
                case 1:
                    return;
                case 2:
                    findAll();
                    break;
                case 3:
                    findById();
                    break;
                default:
                    System.out.println("Mời lựa chọn lại chức năng");
                    break;

            }
        }
    }
    public void findAll() throws SQLException, IOException {
        List<User> users = controller.findAll();
        System.out.println("Danh sách user: ");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |    FULL NAME       |   EMAIL            |");
        System.out.println("+------+--------------------+--------------------+");

        if(users.isEmpty()){
            System.out.printf("| %-4s | %-18s | %-18s |%n","NULL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+");
        }else {
            for (User user : users) {
                int id = user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();

                System.out.printf("| %-4s | %-18s | %-18s |%n",id,fullName,email);
                System.out.println("+------+--------------------+--------------------+");
            }
        }
    }
    public void findById() throws SQLException, IOException {
        System.out.println("Mời bạn nhập thông tin user");
        System.out.println("Nhập id: ");
        int id = ScannerUtil.inputInt();
        User user = controller.findById(id);
        System.out.println("Danh sách user: ");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |    FULL NAME       |   EMAIL            |");
        System.out.println("+------+--------------------+--------------------+");
        if(user == null){
            System.out.printf("| %-4s | %-18s | %-18s |%n","NULL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+");
        }else {
                String fullName = user.getFullName();
                String email = user.getEmail();

                System.out.printf("| %-4s | %-18s | %-18s |%n",id,fullName,email);
                System.out.println("+------+--------------------+--------------------+");
            System.out.println("Tim user thành công");
        }
    }

    public void deleteById() throws SQLException, IOException {
        System.out.println("Mời bạn nhập thông tin user: ");
        System.out.println("Nhập id: ");
        int id = ScannerUtil.inputInt();
        int result = controller.deleteById(id);
        System.out.printf("Xóa thành công %s User ",result);
    }

    public void create() throws SQLException, IOException {

        System.out.println("Nhập thông tin user");
        System.out.println("Nhập fullName: ");
        String fullName = ScannerUtil.inputString();
        System.out.println("Nhập email: ");
        String email = ScannerUtil.inputString();
        int result = controller.create(fullName,email);

        System.out.println("Thêm user thành công");
    }
    public void findByEmailAndPassword() throws SQLException, IOException {
        System.out.println("Nhập thông tin user ");
        System.out.println("Nhập email: ");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập thông tin password");
        String password = ScannerUtil.inputPassword();
        User user = controller.findByEmailAndPassword(email,password);
        if(user == null){
            System.out.println("Đăng nhập thất bại");
        }else {
            String fullname = user.getFullName();
            User.Role role =user.getRole();
            System.out.printf("Đăng nhập thành công: %s - %s %n ",fullname,role);
            if (role == User.Role.ADMIN){
                    showAdminMenu();
            }else {
                showEmployeeMenu();
            }
        }
    }


}
