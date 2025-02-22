package assignment.file;

import java.io.File;

public class fileDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("demo.txt");
        if (file.createNewFile()){
            System.out.println("Create");
        }else {
            System.out.println("File exists");
        }
    }
}
