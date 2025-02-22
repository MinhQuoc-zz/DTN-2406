package assignment.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
public class IOManager {
    private static final String FILE_NOT_EXISTS = "Error! File Not Exists.";

    public static String readFile(String pathFile) throws Exception{
        if (!FileManager.isFileExists(pathFile)){
            throw new Exception(FILE_NOT_EXISTS);
        }
        try(FileInputStream fileInputStream = new FileInputStream(pathFile)) {
            byte[] bytes = fileInputStream.readAllBytes();
            return new String(bytes);

        }
    }
    public static void writeFile(String pathFile,boolean isContinuing,String content) throws Exception{
        if (!FileManager.isFileExists(pathFile)){
            throw new Exception(FILE_NOT_EXISTS);
        }
        try(FileOutputStream fileOutputStream = new FileOutputStream(pathFile,isContinuing)) {
            fileOutputStream.write(content.getBytes());

        }
    }
}
