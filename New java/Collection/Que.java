public class Que {
	public static void main(String[] args) {
		queuee q = new queuee();
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		// System.out.println(q.pop());
		System.out.println(q);
	}
}

class Node {
	Object data;
	Node next;

	Node(Object data) {
		this.data = data;
		next = null;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}
}

class queuee {
	Node front;
	Node rear;
	int size;

	queuee() {
		front = rear = null;
		size = -1;
	}

	public void push(Object data) {
		Node n = new Node(data);
		if (front == null) {
			front = rear = n;
		} else {
			rear.setNext(n);
			rear = n;
			size++;
		}

	}

	public Object pop() {
		if (front == null) {
			return null;
		} else {
			Object o = front.getData();
			front = front.getNext();
			return o;
		}
	}

	public String toString() {
		if (front == null) {
			return null;
		} else {
			String s = "";
			Node n = front;
			while (n != null) {
				s = s + "," + n.getData();
				n = n.getNext();
			}
			s = "[" + s.substring(1) + "]";
			return s;
		}
	}
}