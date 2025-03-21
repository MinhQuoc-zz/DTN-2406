package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
    public static Connection getConnection() throws IOException, SQLException {
        String path = "src/main/resources/database.properties";
        try(FileInputStream fis = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(fis);

            //lấy ra chỉ số
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");

            return DriverManager.getConnection(url,user,password);
        }
    }
    public static void checkConnection(){
        try(Connection connection = getConnection()) {
            System.out.println("Kết nối thành công");
        } catch (SQLException |IOException  e) {
            System.err.println("Kết nối kết bại " + e.getMessage());
        }

    }
}


