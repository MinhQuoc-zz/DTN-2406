package frontend;

import controller.UserController;
import entity.User;
import lombok.AllArgsConstructor;
import repository.UserRepository;
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
            System.out.println("2. Hiển thị danh sach user");
            System.out.println("3. Tìm kiếm theo Id");
            System.out.println("4. Thoát chương trình");

            int menu = ScannerUtil.inputInt();
            switch (menu){
                case 1:
                    findByEmailAndPassword();
                    break;
                case 2:
                    findAll();
                    break;
                case 3:
                    findById();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Mời chọn đúng chức năng");
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
        System.out.println("Mời bạn nhập thông tin user: ");
        System.out.println("Nhập Id:");
        int id = ScannerUtil.inputInt();
        User user = controller.findById(id);
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |    FULL NAME       |   EMAIL            |");
        System.out.println("+------+--------------------+--------------------+");
        if(user == null){
            System.out.printf("| %-4s | %-18s | %-18s |%n","NULL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+");
        }else {

                user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();

                System.out.printf("| %-4s | %-18s | %-18s |%n",id,fullName,email);
                System.out.println("+------+--------------------+--------------------+");

        }
    }

    public void deleteById() throws SQLException, IOException {
        System.out.println("Mời bạn nhập thông tin user cần xóa");
        System.out.println("Nhập id: ");
        int id = ScannerUtil.inputInt();
        int result = controller.deleteById(id);
        System.out.printf("Xóa thành công %d user%n",result);

    }
    public void create() throws SQLException, IOException {
        System.out.println("Mời bạn nhập thông tin user:");
        System.out.println("Nhâp fullname: ");
        String fullName = ScannerUtil.inputString();
        System.out.println("Nhập email: ");
        String email = ScannerUtil.inputString();
        int result = controller.create(fullName,email);
        System.out.println("Tạo user Thành công ");
    }
    public void findByEmailAndPassword() throws SQLException, IOException {
        System.out.println("Mời bạn nhập thông tin user: ");
        System.out.println("Nhâp email: ");
        String email = ScannerUtil.inputString();
        System.out.println("Nhập password: ");
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

    private void showEmployeeMenu() throws SQLException, IOException {
       while (true){
           System.out.println("============Menu===========");
           System.out.println("Mời bạn lựa chọn chức năng:");
           System.out.println("1. Đăng xuất");
           System.out.println("2. Hiển thị danh sach user");
           System.out.println("3. Tìm kiếm theo Id");


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
                   System.out.println("Mời chọn đúng chức năng");
                   break;
           }
       }
    }


    private void showAdminMenu() throws SQLException, IOException {
      while (true){
          System.out.println("============Menu ADMIN===========");
          System.out.println("Mời bạn lựa chọn chức năng:");
          System.out.println("1. Đăng xuất");
          System.out.println("2. Hiển thị danh sach user");
          System.out.println("3. Tìm kiếm theo Id");
          System.out.println("4. xóa user theo Id");
          System.out.println("5. Tạo user");


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
                  deleteById();
                  break;
              case 5:
                  create();
                  break;
              default:
                  System.out.println("Mời chọn đúng chức năng");
                  break;
          }
      }

    }
}
