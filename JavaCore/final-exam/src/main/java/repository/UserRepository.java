package repository;

import entity.User;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements IUserRepository {
    // lấy dữ liệu từ trong database
    // đi tạo class tương ứng với Database trong entity
    @Override
    public List<User> fillAll() throws SQLException, IOException {
        //câu truy vấn
        String sql = "SELECT * FROM users";
        // tạo kết nối đến database và giải phóng
        try (
                //tạo 1 kết nối
                Connection connection = JdbcUtil.getConnection();
                //viết truy vấn
                Statement statement = connection.createStatement();
                //chạy để chạy câu truy vấn
                ResultSet rs = statement.executeQuery(sql);
                ){
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

    @Override
    public User findById(int id) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE id = ?";
        try(
                //chỉ ciết được đối tượng giải phóng tài nguyên
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
                ){
            pStmt.setInt(1,id);
            try(ResultSet rs = pStmt.executeQuery()){
                if(rs.next()){
                    User user = new User();
                    user.setId(id);
                    String fullName = rs.getString("full_name");
                    user.setFullName(fullName);
                    String email = rs.getString("email");
                    user.setEmail(email);
                    String password = rs.getString("password");
                    user.setEmail(password);
                    String role = rs.getString("role");
                    user.setRole(role);
                    return user;
                }else {
                    return null;
                }
            }
        }
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql = "{CALL find_by_email_and_password(?, ?)}";
        try (
                Connection connection = JdbcUtil.getConnection();
                CallableStatement cStmt = connection.prepareCall(sql);
        ) {
            cStmt.setString(1, email);
            cStmt.setString(2, password);
            try (ResultSet rs = cStmt.executeQuery()) {
                if (rs.next()) {
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
                } else {
                    return null;
                }
            }
        }
    }

    @Override
    public int create(String fullName, String email) throws SQLException, IOException {
        //tạo câu truy vấn
        String sql = "INSERT INTO users(full_name,email) VALUES (? , ?)";
        //thực hiện câu truy vấn
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            // truyền giá trị cho 2 dấu ?
            pStmt.setString(1,fullName);
            pStmt.setString(2,email);
            //chạy câu truy vấn
            return pStmt.executeUpdate();
        }
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        //tạo câu truy vấn
        String sql = "DELETE FROM users WHERE id = ?";
        //thực hiện câu truy vấn
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
                ){
            //truyền giá trị cho dấu ?
            pStmt.setInt(1,id);
            //chạy câu truy vấn
            return pStmt.executeUpdate();
        }
    }


}
