import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            al.add(10 * i);
        }
        System.out.println(al);
    }
}