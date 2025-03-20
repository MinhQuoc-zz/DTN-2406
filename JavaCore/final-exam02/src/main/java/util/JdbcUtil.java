package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
        public static Connection getConnection() throws IOException, SQLException {
            // đọc cấu hình tệp
            String path = "src/main/resources/database.properties";
            try (FileInputStream fis = new FileInputStream(path)) {
                Properties properties = new Properties();
                properties.load(fis);

                //Lấy ra url
                String url = properties.getProperty("url");
                String user = properties.getProperty("user");
                String password = properties.getProperty("password");
                return DriverManager.getConnection(url,user,password);
            }
        }

        //check lỗi
    public static void checkConnection(){
            try(Connection connection = getConnection()) {
                System.out.println("Kết nối thành công" + connection.getCatalog());
            } catch (SQLException | IOException e) {
                System.err.println("Kết nối thất bại " +e.getMessage());
            }
    }
    //bước 3 tạo ra 1 đối tượng class
}

