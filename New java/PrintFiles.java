import java.io.File;

public class PrintFiles {
    public static void FileAndFolder(File Directory) {
        File[] files = Directory.listFiles();
        {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file + "->FOLDER");
                    System.out.println("------------->FOLDER<-----------------");
                    FileAndFolder(file);
                } else {
                    System.out.println(file + "->FILE");
                }
            }
        }
    }

    public static void main(String[] args) {
        String Path = "c:\\java\\";
        File DirectoryPath = new File(Path);
        if (DirectoryPath.exists() && DirectoryPath.isDirectory()) {
            FileAndFolder(DirectoryPath);

        } else {
            System.out.println("No Such Folder Exists.");
        }
    }
}