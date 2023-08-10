import java.util.Stack;
public class Stackk{
	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		s.add("Sohaib");
		System.out.println(s);
		s.add("Nilesh");
		s.add("jayee");
		System.out.println(s);
		s.add(2,"anish");
		System.out.println(s);
		s.remove(0);
		System.out.println(s);
		
	}
}