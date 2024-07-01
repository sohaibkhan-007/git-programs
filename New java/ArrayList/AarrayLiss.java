public class AarrayLiss {
    public static void main(String[] args) {

    }
}

class MyArrayListt {
    private int capacity;
    private int size;
    private Object[] arr;
    private boolean isUnique;

    MyArrayListt() {
        capacity = 5;
        size = -1;
        arr = new Object[capacity];
        isUnique = false;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Object obj) {
        if (size == capacity - 1) {
            return;
        }
        arr[++size] = obj;
    }

    public String toString() {
        if (size == -1) {
            return null;
        }
        String s = "";
        for (int i = 0; i <= size; i++) {
            s = s + "," + arr[i];
        }
        s = "[" + s.substring(1) + "]";
        return s;
    }
}