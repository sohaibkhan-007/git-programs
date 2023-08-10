import java.util.Set;

public class Task {
    private int id;
    private String name;

    public void set(int rollno, String n) {
        id = rollno;
        name = n;
    }

    public void get() {
        System.out.println("name:" + name + " id:" + id);
    }

    /*
     * public static void main(String[] args) {
     * Task obj = new Task();
     * obj.set(101, "soahib");
     * obj.get();
     */
}
// }