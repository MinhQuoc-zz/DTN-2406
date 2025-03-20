package frontend;

import controller.UserController;
import repository.IUserRepository;
import repository.UserRepository;
import service.IUserService;
import service.UserService;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException, IOException {
//        UserRepository repository = new UserRepository();
//        UserFunction function = new UserFunction(repository);
//        function.showMenu();
        IUserRepository repository = new UserRepository();
        IUserService service = new UserService(repository);
        UserController controller = new UserController(service);
        UserFunction function = new UserFunction(controller);
        function.showMenu();


    }
}
