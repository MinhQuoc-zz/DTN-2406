package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("Demo.txt", true);
//            byte[] bytes = "Day la noi dung bij ghi de".getBytes();
//            fileOutputStream.write(bytes);
//            fileOutputStream.close();
//        } finally {
//
//        }
        try(FileInputStream fileInputStream = new FileInputStream("Demo.txt")){
            byte[] bytes = fileInputStream.readAllBytes();
            String content = new String((bytes));
            System.out.println(content);
        }
    }

}
