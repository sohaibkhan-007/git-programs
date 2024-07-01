import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList<Integer> al = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            al.add(10 * i);
        }
        System.out.println(al);
    }
}