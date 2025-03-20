package service;

import entity.User;
import lombok.AllArgsConstructor;
import repository.UserRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
@AllArgsConstructor
public class UserService implements IUserService{
    private UserRepository repository;
    @Override
    public List<User> findAll() throws SQLException, IOException {
        return repository.findAll();
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        return repository.findById(id);
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        return repository.deleteById(id);
    }

    @Override
    public int create(String fullName, String email) throws SQLException, IOException {
        return repository.create(fullName,email);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return repository.findByEmailAndPassword(email,password);
    }
}
