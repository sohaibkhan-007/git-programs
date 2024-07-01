public class MyStack2 {
  public static void main(String[] args) {
    Stack n = new Stack();
    n.push(10);
    n.push(20);
    System.out.println(n);

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

class Stack {
  Node top;
  int size;

  Stack() {
    top = null;
    size = -1;
  }

  public void push(Object data) {
    Node n = new Node(data);
    if (top == null) {
      top = n;
    } else {
      n.setNext(top);
      top = n;
    }
    size++;

  }

  public Object pop() {
    if (top == null) {
      return null;
    } else {
      Object o = top.getData();
      top = top.getNext();
      size--;
      return o;
    }

  }

  public String toString() {
    if (top == null) {
      return "[]";
    }
    Node t = top;
    String s = "";
    while (t != null) {
      s = s + "," + t.getData();
      t = t.getNext();
    }
    s = "[" + s.substring(1) + "]";
    return s;
  }
}