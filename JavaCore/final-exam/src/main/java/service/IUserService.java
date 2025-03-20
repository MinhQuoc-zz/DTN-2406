package service;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    // lấy dữ liệu từ trong database
    // đi tạo class tương ứng với Database trong entity
    List<User> fillAll() throws SQLException, IOException;

    User findById(int id) throws SQLException, IOException;

    User findByEmailAndPassword(String email, String password) throws SQLException, IOException;

    int create(String fullName, String email) throws SQLException, IOException;

    int deleteById(int id) throws SQLException, IOException;
}
