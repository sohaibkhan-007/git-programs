import java.util.Stack;
public class Sstack{
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("sohaib");
		s.push("khan");
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}
}