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
    public List<User> findByProjectId(int projectId) throws SQLException, IOException {
        return repository.findByProjectId(projectId);
    }

    @Override
    public List<User> findAllManager() throws SQLException, IOException {
        return repository.findAllManager();
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return repository.findByEmailAndPassword(email,password);
    }
}
