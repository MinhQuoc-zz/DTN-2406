package repository;

import entity.User;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;


public class UserRepository implements IUserRepository {
    @Override
    public List<User> findByProjectId(int projectId) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE project_id = ?";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ) {
            pStmt.setInt(1,projectId);
            try(ResultSet rs = pStmt.executeQuery()) {
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
                    user.setProjectId(projectId);
                    int expInYear = rs.getInt("exp_in_year");
                    user.setExpInYear(expInYear);
                    String proSkill = rs.getString("pro_skill");
                    user.setProSkill(proSkill);
                    String role = rs.getString("role");
                    user.setRole(role);

                    if ("employee".equalsIgnoreCase(role)) {
                        users.add(user);
                    }
                }
                if (!users.isEmpty()) {
                    return users;
                } else {
                    return new LinkedList<>();
                }
            }
        }
    }
    @Override
    public List<User> findAllManager() throws SQLException, IOException {
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
                int projectId = rs.getInt("project_id");
                user.setProjectId(projectId);
                int expInYear = rs.getInt("exp_in_year");
                user.setExpInYear(expInYear);
                String proSkill = rs.getString("pro_skill");
                user.setProSkill(proSkill);
                String role = rs.getString("role");
                user.setRole(role);

                if ("manager".equalsIgnoreCase(role)) {
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
    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql ="SELECT * FROM users WHERE email = ? AND password = ?";
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
