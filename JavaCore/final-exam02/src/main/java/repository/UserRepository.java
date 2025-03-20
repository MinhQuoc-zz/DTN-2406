package repository;

import com.sun.source.tree.WhileLoopTree;
import entity.User;
import util.JdbcUtil;
import util.ScannerUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException, IOException {
        String sql = "SELECT * FROM users";
        try(
                Connection connection = JdbcUtil.getConnection();
                Statement stmt = connection.createStatement();

                ResultSet rs = stmt.executeQuery(sql);
                ) {
            List<User> users = new LinkedList<>();
            while (rs.next()){
                User user = new User();
                int id = rs.getInt("id");
                user.setId(id);
                String fullName = rs.getString("full_name");
                user.setFullName(fullName);
                String email = rs.getString("email");
                user.setEmail(email);
                String password = rs.getString("password");
                user.setPassword(password);
                String role = rs.getString("role");
                user.setRole(role);

                //thêm đối tượng vào danh sách
                users.add(user);
            }
            return users;
        }
    }

    public User findById(int id) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE id = ?";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ) {
            //truyền giá trị cho dấu ?
            pStmt.setInt(1,id);
            //Thực thi câu lệnh
            try(ResultSet rs = pStmt.executeQuery()){
                if (rs.next()){
                    User user = new User();
                    user.setId(id);
                    String fullName = rs.getString("full_name");
                    user.setFullName(fullName);
                    String email = rs.getString("email");
                    user.setEmail(email);
                    String password = rs.getString("password");
                    user.setPassword(password);
                    String role = rs.getString("role");
                    user.setRole(role);
                    return user;
                }else {
                    return null;
                }
            }
        }
    }
    //đăng nhập
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        //truy vấn
        String sql = "CALL find_by_email_and_password(?, ?)";
        try(
                Connection connection = JdbcUtil.getConnection();
                CallableStatement cStmt = connection.prepareCall(sql)
                ){
            //truyền giá trị cho dấu ?
            cStmt.setString(1,email);
            cStmt.setString(2,password);
            try(ResultSet rs = cStmt.executeQuery()){
                if (rs.next()){
                    User user = new User();
                    int id = rs.getInt("id");
                    user.setId(id);
                    String fullName = rs.getString("full_name");
                    user.setFullName(fullName);
                    user.setEmail(email);
                    user.setPassword(password);
                    String role = rs.getString("role");
                    user.setRole(role);

                    return user;
                }
                return null;
            }
        }
    }
    //Tạo người dùng mới
    public int create(String fullName,String email) throws SQLException, IOException {
        String sql = "INSERT INTO users(full_name,email) VALUES (? , ?)";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ){
            //truyền giá trị cho 2 dấu ?
            pStmt.setString(1,fullName);
            pStmt.setString(2,email);

            return pStmt.executeUpdate();
        }
    }

    public int deleteById(int id) throws SQLException, IOException {
        String sql = "DELETE FROM users WHERE id = ?";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ){
            //truyền giá trị cho dấu ?
            pStmt.setInt(1,id);
            //chạy câu truy vấn
            return pStmt.executeUpdate();
        }
    }
}
