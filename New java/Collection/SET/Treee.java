import java.util.*;

public class Treee{
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("sohaib");
		t.add("mohsin");
		t.add("sahil");
		t.add("asad");
		//traversing a treeset in accending order. 
		//Iterator<String> it = t.iterator();

		// Traversing a Treeset in decending order. 
		// Iterator<String> it = t.descendingIterator();
        
        // while(it.hasNext()){
		// System.out.println(it.next());    	
        // }
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t);
	}
}