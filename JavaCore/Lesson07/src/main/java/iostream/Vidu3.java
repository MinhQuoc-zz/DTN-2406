package iostream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Vidu3 {
    public static void writeObject(Object object, String path, String fileName) throws Exception{
        if(object == null){
            throw new Exception("Error");
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(path + fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            throw new Exception("Error writing object to file: " + e.getMessage(), e);
        }
    }

    public static void readObject(String filePath) throws Exception{

    }

    public static void main(String[] args) {

    }

}
