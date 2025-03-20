package repository;

import entity.User;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public User findById(int id) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (
                //chỉ ciết được đối tượng giải phóng tài nguyên
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setInt(1, id);
            try (ResultSet rs = pStmt.executeQuery()) {
                if (rs.next()) {
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
                    int expInYear = rs.getInt("exp_in_year");
                    user.setExpInYear(expInYear);

                    if ("teacher".equalsIgnoreCase(role)) {
                        return user;
                    }
                    return null;
                }
                return null;
            }
        }
    }

    public List<User> findAll() throws SQLException, IOException {
        String sql = "SELECT * FROM users";
        try (
                Connection connection = JdbcUtil.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            List<User> users = new LinkedList<>();
            while (rs.next()) {
                User user = new User();
                int id = rs.getInt("id");
                user.setId(id);
                String fullName = rs.getString("full_name");
                user.setFullName(fullName);
                String email = rs.getString("email");
                user.setEmail(email);
                String password = rs.getString("password");
                user.setPassword(password);
                String major = rs.getString("major");
                user.setMajor(major);
                String role = rs.getString("role");
                user.setRole(role);


                if ("student".equalsIgnoreCase(role)) {
                    users.add(user);
                }
            }
            if (!users.isEmpty()) {
                return users;
            }else {
                return null;
            }
        }
    }
}
