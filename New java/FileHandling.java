import java.io.*;
import java.lang.reflect.Method;

import javafx.scene.shape.Path;

public class FileHandling {

    public static void FileAndFolder(File Directory) {
        File[] files = Directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file + "->FOLDER.");
                    System.out.println("-----------FOLDER--------------------------------");
                    FileAndFolder(file);
                } else {
                    System.out.println(file + "->FILE");

                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String Path = "C:\\java\\";
        File DirectoryPath = new File(Path);
        if (DirectoryPath.exists() && DirectoryPath.isDirectory()) {
            FileAndFolder(DirectoryPath);
        } else {
            System.out.println("NO Such Directory Found.");
        }

    }
}