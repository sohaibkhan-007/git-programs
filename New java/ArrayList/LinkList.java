public class LinkList {
    public static void main(String[] args) {
        MyLinkList l = new MyLinkList();
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.addLast(40);
        l.addLast(50);
        System.out.println(l);
        l.reverse();
        System.out.println(l);

    }
}

class Node {
    private Object data;
    private Node next;

    Node(Object data) {
        this.data = data;
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

class MyLinkList {
    Node start, last;
    int size;

    MyLinkList() {
        start = last = null;
        size = 0;
    }

    public void addFirst(Object val) {
        Node n = new Node(val);
        if (start == null) {
            start = last = n;
        } else {
            n.setNext(start);
            start = n;
        }
        size++;
    }

    public void addLast(Object val) {
        Node n = new Node(val);
        if (start == null) {
            start = last = n;
        } else {
            last.setNext(n);
            last = n;
        }
        size++;
    }

    public Object get(int index) {
        if (index >= 0 && index <= size) {

            Node t = start;
            int c = 0;
            while (c != index) {
                t = t.getNext();
                c++;
            }
            return t.getData();
        } else {
            return -1;
        }
    }

    public void set(int index, Object data) {
        Node t = start;
        int c = 0;
        while (c != index) {
            t = t.getNext();
            c++;
        }
        t.setData(data);

    }

    public Object remove(int index) {
        if (index >= 0 && index <= size) {
            Node t = start;
            int c = 0;
            while (c + 1 != index) {
                t = t.getNext();
                c++;
            }
            Object obj = t.getNext().getData();
            t.setNext(t.getNext().getNext());
            return obj;

        } else {
            return -1;d
        }

    }

    public boolean contains(Object obj) {
        Node t = start;
        while (t != null) {
            if (t.getData() == obj) {
                return true;
            }
            t = t.getNext();
        }
        return false;

    }

    public int lastIndexOf(Object obj) {
        Node t = start;
        int c = -1;
        int x = -1;
        while (c != size - 1) {
            c++;
            if (t.getData() == obj) {
                x = c;
            }
            t = t.getNext();
        }
        return x;
    }

    public int indexOf(Object obj) {
        Node t = start;
        int c = -1;
        while (c != size) {
            c++;
            if (t.getData() == obj) {
                return c;
            }
            t = t.getNext();
        }
        return -1;
    }

    public void clear() {
        start = last = null;
        size = 0;

    }

    public Object getFirst() {
        return start.getData();
    }

    public Object getLast() {
        return last.getData();
    }

    public void removeFirst() {
        start = start.getNext();
    }

    public void removeLast() {
        Node n = start;
        while (n.getNext().getNext() != null) {
            n = n.getNext();
        }
        n.setNext(null);
        last = n;
    }

    public Object peek() {
        return start.getData();
    }

    public Object poll() {
        Object o = start.getData();
        start = start.getNext();
        return o;
    }

    public void offer(int x) {
        Node n = new Node(x);
        last.setNext(n);
        last = last.getNext();

    }

    public void reverse() {
        Node pre = null;
        Node curr = start;
        Node next = null;
        while (curr != null) {
            next = curr.getNext();
            curr.setNext(pre);
            pre = curr;
            curr = next;
        }
        Node n = start;
        start = last;
        last = n;
    }

    public int size() {
        return size;
    }

    public String toString() {
        if (start == null) {
            return "[]";
        }
        String s = "";
        Node t = start;
        while (t != null) {
            s = s + "," + t.getData();
            t = t.getNext();
        }
        s = "[" + s.substring(1) + "]";
        return s;

    }
}