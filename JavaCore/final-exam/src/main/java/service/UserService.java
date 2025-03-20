package service;

import entity.User;
import lombok.AllArgsConstructor;
import repository.IUserRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserService implements IUserService{

    private IUserRepository repository;
    @Override
    public List<User> fillAll() throws SQLException, IOException {
        return repository.fillAll();
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        return repository.findById(id);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return repository.findByEmailAndPassword(email,password);
    }

    @Override
    public int create(String fullName, String email) throws SQLException, IOException {
        return repository.create(fullName,email);
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        return repository.deleteById(id);
    }
}
