package repository;

import entity.User;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements IUserRepository {
    @Override
    public List<User> findAll() throws SQLException, IOException {
        String sql = "SELECT * FROM users ";
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

                users.add(user);

            }
            return users;
        }
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE id = ? ";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ){
            pStmt.setInt(1,id);
            try(ResultSet rs = pStmt.executeQuery()) {
                while (rs.next()){
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
                }
                return null;
            }
        }
    }
    @Override
    public int deleteById(int id) throws SQLException, IOException {
        String sql = "DELETE FROM users WHERE id = ? ";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ) {
            pStmt.setInt(1,id);
            return pStmt.executeUpdate();
        }
    }

    @Override
    public int create(String fullName, String email) throws SQLException, IOException {
        String sql = "INSERT INTO users(full_name,email) VALUES (?, ?)";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ) {
            pStmt.setString(1,fullName);
            pStmt.setString(2,email);
           return pStmt.executeUpdate();
        }
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql ="SELECT * FROM users WHERE email = ? AND password = ? ";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ) {

            pStmt.setString(1,email);
            pStmt.setString(2,password);
            try(ResultSet rs = pStmt.executeQuery()) {
                    while (rs.next()){
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
}
