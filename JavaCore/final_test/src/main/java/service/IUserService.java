package service;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> findByProjectId(int projectId) throws SQLException, IOException;

    List<User> findAllManager() throws SQLException, IOException;

    User findByEmailAndPassword(String email, String password) throws SQLException, IOException;
}
