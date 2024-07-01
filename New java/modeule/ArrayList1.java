import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);

        int x = list.get(1);
        System.out.println(x);

        list.add(0, 0);
        System.out.println(list);

        list.set(0, 1);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println(list.size());

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

    }
}