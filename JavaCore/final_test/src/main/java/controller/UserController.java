package controller;

import entity.User;
import lombok.AllArgsConstructor;
import service.UserService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserController {
    private UserService service;

    public List<User> findByProjectId(int projectId) throws SQLException, IOException {
        return service.findByProjectId(projectId);
    }


    public List<User> findAllManager() throws SQLException, IOException {
        return service.findAllManager();
    }


    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return service.findByEmailAndPassword(email,password);
    }
}
