import java.util.*;

public class Curser {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Sohiab");
        names.add("sahil");
        names.add("asad");

        ListIterator<String> namesIterator = names.listIterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        while (namesIterator.hasPrevious()) {
            System.out.print(namesIterator.previous() + ", ");
        }
    }
}