import java.io.File;

public class FileClass {

    public static void main(String[] args) throws Exception {
        

        File f = new File("c://");
        if (f.exists()) {
            if (f.isDirectory()) {
                String files[] = f.list();
                for (String s : files) {
                    System.out.println(s);
                }
            } else
                System.out.println("file exists.");
        } else {
            f.mkdir();
            System.out.println("new folder is created.");
        }
    }
}