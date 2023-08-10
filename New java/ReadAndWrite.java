import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWrite {

    public static void main(String[] args) throws Exception {

        File myFile = new File("xyz.txt");
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter("xyz.txt");
        fileWriter.write("1234567890-ppoiuytrewqaxcvbnm\0ok now by");
        fileWriter.close();
        FileReader fileReader = new FileReader("xyz.txt");
        fileReader.read();
        File[] files = new File[25];
        for (File file : files) {
            System.out.print(((char) fileReader.read()));
        }
        fileReader.close();
    }
}