package frontend;

import controller.UserController;
import entity.User;
import lombok.AllArgsConstructor;
import util.ScannerUtil;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
//    private UserRepository repository;
    private UserController controller;

    public void showMenu() throws SQLException, IOException {
       while (true){
           System.out.println("1. Đăng nhập");
           System.out.println("2. Hiển thị danh sách user");
           System.out.println("3. Tìm kiếm user theo id");
           System.out.println("4. Thoát chương trình");
           System.out.println("Mời bạn chọn chức năng");

           int menu = ScannerUtil.inputInt();
           if (menu == 1){
               findByEmailAndPassword();
           }else if(menu == 2){
               findAll();
           } else if (menu == 3) {
               findById();
           } else if (menu == 4) {
               return;
           }else {
               System.out.println("Yêu cầu nhập lại chức năng");
           }
       }
    }

    public void showAdminMenu() throws SQLException, IOException {
        while (true){
            System.out.println("1. Đăng xuất");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo id");
            System.out.println("4. Thêm user");
            System.out.println("5. xóa user theo id");
            System.out.println("Mời bạn chọn chức năng");

            int menu = ScannerUtil.inputInt();
            if (menu == 1){
                return;
            }else if(menu == 2){
                findAll();
            } else if (menu == 3) {
                findById();
            } else if (menu == 4) {
                create();
            } else if (menu == 5) {
                deleteById();
            } else {
                System.out.println("Yêu cầu nhập lại chức năng");
            }
        }

    }

    public void showEmployeeMenu() throws SQLException, IOException {
        while (true){
            System.out.println("1. Đăng xuất");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo id");
            System.out.println("Mời bạn chọn chức năng");

            int menu = ScannerUtil.inputInt();
            if (menu == 1){
                return;
            }else if(menu == 2){
                findAll();
            } else if (menu == 3) {
                findById();
            } else {
                System.out.println("Yêu cầu nhập lại chức năng");
            }
        }

    }
    public void findAll() throws SQLException, IOException {
        List<User> users = controller.fillAll();
        System.out.println("Danh sách user: ");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |");
        System.out.println("+------+--------------------+--------------------+");
        if(users.isEmpty()){
            System.out.printf("| %-4s | %-18s | %-18s |%n",
                    "NULL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+");
        }else {
            for (User user : users) {
                int id = user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();

                System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullName,email);
                System.out.println("+------+--------------------+--------------------+");
            }
        }
    }

    public void findById() throws SQLException, IOException {
        System.out.println("Mời bạn nhập vào thông tin cần tìm kiếm: ");
        System.out.println("Nhập vào id: ");
        int id = ScannerUtil.inputInt();
        User user = controller.findById(id);
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |");
        System.out.println("+------+--------------------+--------------------+");
        if(user == null){
            System.out.printf("| %-4s | %-18s | %-18s |%n",
                    "NULL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+");
        }else {

                String fullName = user.getFullName();
                String email = user.getEmail();
                System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullName,email);
                System.out.println("+------+--------------------+--------------------+");

        }
    }

    public void findByEmailAndPassword() throws SQLException, IOException {
        System.out.println("Mời bạn nhập vào thông tin đăng nhâp");
        System.out.println("Nhập vào email" );
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào password: ");
        String password = ScannerUtil.inputPassword();

        User user = controller.findByEmailAndPassword(email,password);
        if(user == null){
            System.err.println("Đăng nhập thất bại");
        }else {
            String fullName = user.getFullName();
            User.Role role = user.getRole();
            System.out.printf("Đăng nhập thành công: %s - %s%n ",fullName, role);
            if(role == User.Role.ADMIN){
                showAdminMenu();
            }else {
                showEmployeeMenu();
            }
        }
    }

    public void create() throws SQLException, IOException {
        System.out.println("Mời bạn nhập vào thông tin user");
        System.out.println("Nhập vào full name: ");
        String fullName = ScannerUtil.inputFullName();
        System.out.println("Nhập vào email: ");
        String email = ScannerUtil.inputEmail();

        int result = controller.create(fullName,email);
        System.out.printf("Tạo thành công %d user(s).%n", result);
    }

    public void deleteById() throws SQLException, IOException {
        System.out.println("Mời bạn nhập thông tin cần xóa");
        System.out.println("Nhập vào Id: ");
        int id = ScannerUtil.inputInt();
        int result = controller.deleteById(id);
        System.out.printf("Xóa thành công %d user(s).%n", result);
    }
}
