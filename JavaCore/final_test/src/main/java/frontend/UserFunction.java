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
    private UserController controller;

    public void showMenu() throws SQLException, IOException {
        while (true){
            System.out.println("============Menu===========");
            System.out.println("Mời bạn lựa chọn chức năng:");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Hiển thị danh sách employee theo projectId");
            System.out.println("3. Hiển thị danh sách Manager");
            System.out.println("4. Thoát chương trình");

            int menu = ScannerUtil.inputInt();
            switch (menu){
                case 1:
                    findByEmailAndPassword();
                    break;
                case 2:
                    findByProjectId();
                    break;
                case 3:
                    findAllManager();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Mời chọn đúng chức năng");
                    break;
            }
        }
    }
    private void showManagerMenu() throws SQLException, IOException {
        while (true){
            System.out.println("============Menu Manager===========");
            System.out.println("Mời bạn lựa chọn chức năng:");
            System.out.println("1. Đăng xuất");
            System.out.println("2. Hiển thị danh sách employee theo projectId");
            System.out.println("3. Hiển thị danh sách Manager");

            int menu = ScannerUtil.inputInt();
            switch (menu){
                case 1:
                    return;
                case 2:
                    findByProjectId();
                    break;
                case 3:
                    findAllManager();
                    break;
                default:
                    System.out.println("Mời chọn đúng chức năng");
                    break;
            }
        }
    }
    private void showEmployeeMenu() throws SQLException, IOException {
        while (true){
            System.out.println("============Menu Employee===========");
            System.out.println("Mời bạn lựa chọn chức năng:");
            System.out.println("1. Đăng xuất");
            System.out.println("2. Hiển thị danh sách employee theo projectId");
            System.out.println("3. Hiển thị danh sách Manager");

            int menu = ScannerUtil.inputInt();
            switch (menu){
                case 1:
                    return;
                case 2:
                    findByProjectId();
                    break;
                default:
                    System.out.println("Mời chọn đúng chức năng");
                    break;
            }
        }
    }
    public void findByProjectId() throws SQLException, IOException {
        System.out.println("Mời nhập thông tin user ");
        System.out.println("Nhập project Id: ");
        int projectId = ScannerUtil.inputInt();
        List<User> users = controller.findByProjectId(projectId);

        System.out.println("+------+--------------------+--------------------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |     PROJECT_ID     |   PRO_SKILL        |");
        System.out.println("+------+--------------------+--------------------+--------------------+--------------------+");
        if(users.isEmpty() ){
            System.out.printf("| %-4s | %-18s | %-18s | %-18s | %-18s |%n",
                    "NULL","NULL","NULL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+--------------------+--------------------+");
        }else {

            for (User user : users) {
                int id = user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();
                user.getProjectId();
                String proSkill = user.getProSkill();
                System.out.printf("| %-4s | %-18s | %-18s | %-18s | %-18s %n",id,fullName,email,projectId,proSkill);
                System.out.println("+------+--------------------+--------------------+--------------------+--------------------+");
            }

        }
    }

    public void findAllManager() throws SQLException, IOException {
        List<User> users = controller.findAllManager();
        System.out.println("Danh sách các manager: ");
        System.out.println("+------+--------------------+--------------------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |     PROJECT_ID     |   EXP_IN_YEAR      |");
        System.out.println("+------+--------------------+--------------------+--------------------+--------------------+");
        if(users.isEmpty() ){
            System.out.printf("| %-4s | %-18s | %-18s | %-18s | %-18s %n",
                    "NULL","NULL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+--------------------+--------------------+");
        }else {
            for (User user : users) {
                int id = user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();
                int projectId = user.getProjectId();
                int expInYear = user.getExpInYear();
                System.out.printf("| %-4s | %-18s | %-18s | %-18s | %-18s |%n", id, fullName,email,projectId,expInYear);
                System.out.println("+------+--------------------+--------------------+--------------------+--------------------+");
            }
        }
    }

    public void findByEmailAndPassword() throws SQLException, IOException {
        System.out.println("Mời bạn nhập thông tin user: ");
        System.out.println("Nhâp email: ");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập password: ");
        String password = ScannerUtil.inputPassword();
        User user = controller.findByEmailAndPassword(email,password);
        if(user == null){
            System.err.println("Đăng nhập thất bại");
        }else {
            String fullName = user.getFullName();
            User.Role role = user.getRole();
            System.out.printf("Đăng nhập thành công: %s - %s%n ",fullName, role);
            if(role == User.Role.MANAGER){
                showManagerMenu();
            }else {
                showEmployeeMenu();
            }
        }
    }

}
