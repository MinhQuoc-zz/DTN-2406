package controller;

import entity.User;
import lombok.AllArgsConstructor;
import service.IUserService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService service;

    public List<User> fillAll() throws SQLException, IOException {
        return service.fillAll();
    }


    public User findById(int id) throws SQLException, IOException {
        return service.findById(id);
    }


    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return service.findByEmailAndPassword(email,password);
    }


    public int create(String fullName, String email) throws SQLException, IOException {
        return service.create(fullName,email);
    }


    public int deleteById(int id) throws SQLException, IOException {
        return service.deleteById(id);
    }
}
