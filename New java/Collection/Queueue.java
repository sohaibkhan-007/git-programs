import java.util.ArrayDeque;

public class Queueue {
    public static void main(String[] args) {
        ArrayDeque<String> s = new ArrayDeque<>(); // FIFO
        s.add("Sohiab");
        s.add("sahil khan");
        s.add("sameer khan");
        System.out.println(s);
        s.remove();
        System.out.println(s);

    }
}