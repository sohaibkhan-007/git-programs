import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            hset.add(i);
        }

        // if (hset.contains(2)) {
        // System.out.println("HashSet contains 2.");
        // }
        // if (!hset.contains(5)) {
        // System.out.println("Hashset does not contains 5");
        // }
        // hset.remove(1);
        // if (!hset.contains(1)) {
        // System.out.println("1 is deleted succsefully");
        // }

        // System.out.println(hset.size());

        // System.out.println(hset);
        Iterator it = hset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}