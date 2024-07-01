import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

    int id;
    String name;

    public Student(int id, String name) {
        this.name = name;
        this.id = id;

    }
}

public class Practice {

    // public static void main(String[] args) throws Exception {
    // Student s1 = new Student(100, "sohaib");

    // FileOutputStream fos = new FileOutputStream("practice.txt");
    // ObjectOutputStream oos = new ObjectOutputStream(fos);

    // oos.writeObject(s1);
    // oos.close();
    // System.out.println("sucsses");

    // }

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("practice.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s = (Student) ois.readObject();
        System.out.println(s.id + " " + s.name);
    }

}