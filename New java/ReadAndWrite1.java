import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.Buffer;

public class ReadAndWrite1 {

    public static void main(String[] args) throws Exception {

        // PrintWriter pw = new PrintWriter("abc.txt");
        // pw.println("a");
        // pw.println("100");
        // pw.println("sohaib");
        // pw.println('k');
        // pw.close();

        FileWriter fw = new FileWriter("abcd.jpg");
        FileReader fr = new FileReader("20737.jpg");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        int a = br.read();
        while (a != -1) {
            bw.write(a);
            a = br.read();
        }
        bw.close();
        br.close();
    }
}