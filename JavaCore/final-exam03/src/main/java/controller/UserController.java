package controller;

import entity.User;
import lombok.AllArgsConstructor;
import repository.UserRepository;
import service.IUserService;
import service.UserService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserController implements IUserService {
    private UserService service;
    @Override
    public List<User> findAll() throws SQLException, IOException {
        return service.findAll();
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        return service.findById(id);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return service.findByEmailAndPassword(email,password);
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        return service.deleteById(id);
    }

    @Override
    public int create(String fullname, String email) throws SQLException, IOException {
        return service.create(fullname,email);
    }
}
