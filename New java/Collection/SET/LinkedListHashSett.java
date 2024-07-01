import java.util.*;

public class LinkedListHashSett {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet();
        for (int i = 1; i <=10; i++) {
            set.add(i + "");
        }

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
