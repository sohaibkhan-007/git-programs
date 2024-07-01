import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.Buffer;

public class FileReadAndWrite {
    public static void createNewFile(String fileName, int n) throws Exception {

        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        int x = 111;
        for (int i = 1; i < 7; i++) {
            pw.println(x * i);
            i += n;
        }
        bw.close();

    }

    public static void allData(String data) throws Exception {

        FileWriter fw = new FileWriter("ALLData", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(data);
        bw.newLine();
        bw.close();
    }

    public static void addAllData(String FILEone, String FILEtwo) throws Exception {
        FileReader fw1 = new FileReader(FILEone);
        BufferedReader br1 = new BufferedReader(fw1);
        String s1 = br1.readLine();
        while (s1 != null) {
            allData(s1);
            s1 = br1.readLine();

        }
        FileReader fw2 = new FileReader(FILEtwo);
        BufferedReader br2 = new BufferedReader(fw2);
        String s2 = br2.readLine();
        while (s2 != null) {
            allData(s2);
            s2 = br2.readLine();

        }

        br1.close();
        br2.close();

    }

    public static void sameData(String fileOne, String fileTwo) throws Exception {
        FileReader fr1 = new FileReader(fileOne);
        BufferedReader br1 = new BufferedReader(fr1);
        String s1 = br1.readLine();

        FileWriter fw1 = new FileWriter("SAMEData.txt");
        BufferedWriter bw1 = new BufferedWriter(fw1);

        while (s1 != null) {
            int f = 0;
            FileReader fr2 = new FileReader(fileTwo);
            BufferedReader br2 = new BufferedReader(fr2);
            String s2 = br2.readLine();
            while (s2 != null) {
                if (s1.equals(s2)) {
                    bw1.write(s1);
                    bw1.newLine();
                    f++;
                    break;
                }
                s2 = br2.readLine();
            }
            s1 = br1.readLine();

        }
        br1.close();
        bw1.close();
    }

    public static void diffrentData(String fileOne, String file) throws Exception {
        FileReader fr1 = new FileReader(fileOne);
        BufferedReader br1 = new BufferedReader(fr1);
        String s1 = br1.readLine();

        FileWriter fw = new FileWriter("DIFFRENTData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();

        while (s != null) {

            while (s1 != null) {
                if (s1.equals(s)) {
                    s1 = br1.readLine();
                    s = br.readLine();
                } else {
                    bw.write(s1);
                    bw.newLine();
                    s1 = br1.readLine();
                }
            }
            s = br.readLine();
        }

        bw.close();
        br.close();
        br1.close();

    }

    public static void main(String[] args) throws Exception {
        createNewFile("FILEone.txt", 1);
        createNewFile("FILEtwo.txt", 0);
        addAllData("FILEone.txt", "FILEtwo.txt");
        sameData("FILEone.txt", "FILEtwo.txt");
        diffrentData("FILEone.txt", "SAMEData.txt");
        diffrentData("FILEtwo.txt", "SAMEData.txt");

    }

}