public class MyStack {
	public static void main(String[] args) {
		MyStack1<Integer> m = new MyStack1<Integer>();
		m.push(1);
		m.push(2);
		m.push(3);

		System.out.println(m);

	}
}

class MyStack1<T> {
	private int top;
	private int capacity;
	Object[] stack;

	public MyStack1() {
		top = -1;
		capacity = 5;
		stack = new Object[capacity];
	}

	public int getSize() {
		return top;
	}

	public boolean empty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}

	}

	public void push(T obj) {
		if (top == capacity - 1) {
			System.out.println("stack is full.");
			return;
		}
		top = top + 1;
		stack[top] = obj;
	}

	public Object pop() {
		if (top != -1) {
			return stack[top--];
		} else {
			System.out.println("stack is empty.");
			return null;
		}
	}

	public Object peek() {
		if (top != -1) {
			return stack[top];
		} else {
			System.out.println("stack is empty.");
			return null;
		}
	}

	public int search(Object ob) {
		for (int i = 0; i <= top; i++) {
			if (stack[i].equals(ob)) {
				return i;
			}
		}
		return -1;
	}

	public String toString() {
		String s = "";
		for (int i = top; i >= 0; --i) {
			s = s + "," + stack[i];
		}
		s = "[" + s + "]";
		s = s.substring(2);
		s = "[" + s;
		return s;
	}
}