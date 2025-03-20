package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
    // bước 1: Tạo thư viện
    // bước 2: Tạo kết nối từ java -> database
    public static Connection getConnection() throws SQLException, IOException {
        String path = "src/main/resources/database.properties";
        try (FileInputStream fis = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(fis);
            //lấy ra url
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            return DriverManager.getConnection(url, user, password);
        }
    }

//            String url = "jdbc:mysql://localhost:3306/final_exam";
//            String user = "root";
//            String password = "08062003";
//
//            // lấy ra kết nối
//            return DriverManager.getConnection(url,user,password);

    //check lỗi
    public static void checkConnection(){
        try(Connection connection = getConnection()) {
            System.out.println("Kết nối thành công");
        }catch (SQLException | IOException exception){
            System.err.println("Kết nối thất bại " + exception.getMessage());
        }
    }
    //Bước 3:Tạo ra 1 đối tượng class (Create a statement object)
}
