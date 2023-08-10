import java.lang.reflect.Array;
import java.util.ArrayList;

public class CreateMyArrayList {
	public static void main(String[] args) {
		MyArrayList ml = new MyArrayList();
		ml.add(1);
		ml.add(2);
		ml.add(3);
		ml.add(4);
		ml.add(5);
		ml.add(6);
		System.out.println(ml);
	}
}

class MyArrayList {
	private int capacity;
	private int size;
	private Object[] arr;
	private boolean isUnique;

	public MyArrayList() {
		this(5);
	}

	public MyArrayList(MyArrayList m) {
		this();
		addAll(m);
	}

	public MyArrayList(int cap) {
		capacity = cap;
		size = -1;
		arr = new Object[capacity];
		isUnique = false;
	}

	public MyArrayList(boolean val) {
		this();
		this.isUnique = val;
	}

	public int getCapacity() {
		return capacity;
	}

	public void add(Object val) {
		if (isUnique && indexOf(val) != -1) {
			return;
		} else {

			if (size == capacity - 1) {
				increaseCapacity();
			}
			arr[++size] = val;
		}
	}

	public void addAll(MyArrayList mal) {
		for (int i = 0; i <= mal.size; i++) {
			add(mal.get(i));
		}
	}

	public void clear() {
		size = -1;
	}

	public MyArrayList clone() {
		MyArrayList mal = new MyArrayList();
		for (int i = 0; i <= size; i++) {
			mal.add(arr[i]);
		}
		return mal;
	}

	public boolean contains(Object val) {
		return indexOf(val) != -1;
	}

	public Object get(int index) {
		if (index >= 0 && index <= size) {
			return arr[index];
		}
		return null;
	}

	public int indexOf(Object obj) {
		if (obj == null) {
			for (int j = 0; j <= size; j++) {
				if (arr[j] == null) {
					return j;
				}
			}
		} else {
			for (int i = 0; i <= size; i++) {
				if (obj.equals(arr[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	public void removeAll(Object n) {

		for (int i = 0; i <= size; i++) {
			if (arr[i].equals(n)) {
				remove(i);
			}
		}
	}

	public Object remove(int index) {
		if (index >= 0 && index <= size) {

			Object removed = arr[index];
			for (int i = index; i <= size; i++) {
				arr[index] = arr[index + 1];
			}
			arr[size] = null;
			size--;
			return removed;
		}
		return null;
	}

	public int Size() {
		return size + 1;
	}

	public boolean isEmpty() {
		if (size == -1)
			return true;
		return false;

	}

	public MyArrayList subList(int from, int to) {

		try {
			MyArrayList mal = new MyArrayList();
			for (int i = from; i <= to; i++) {
				mal.add(arr[i]);
			}

			return mal;
		} catch (Exception e) {
			return null;
		}
	}

	public Object set(int i, Object obj) {
		Object o = arr[i];
		arr[i] = obj;
		return o;
	}

	public void sort() {
		int n = size;
		Object temp = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = n; j > i; j--) {
				if ((Integer) arr[i] > (Integer) arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public int[] toArray() {
		int a[] = new int[size + 1];
		for (int i = 0; i <= size; i++) {
			a[i] = (int) arr[i];
		}
		return a;
	}

	public String toString() {
		if (size == -1)
			return "[]";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= size; i++) {
			sb.append(",").append(arr[i]);
		}
		return "[" + sb.substring(1) + "]";
	}

	public void insureCapacity(int cap) {
		capacity = cap;
	}

	public int lastIndexOf(Object obj) {

		for (int i = size; i >= 0; i--) {
			if (arr[i] == obj) {
				return i;
			}
		}
		return -1;

	}

	public MyArrayList retainAll(MyArrayList mal) {
		if (mal == null) {
			return new MyArrayList();
		}

		MyArrayList same = new MyArrayList();
		for (int i = 0; i <= size; i++) {
			if (mal.contains(arr[i])) {
				same.add(arr[i]);
			}
		}
		return same;
	}

	public MyArrayList containsAll(MyArrayList mal) {
		if (mal == null) {
			return new MyArrayList();
		}

		MyArrayList differ = new MyArrayList();
		for (int i = 0; i <= size; i++) {
			if (!mal.contains(arr[i])) {
				differ.add(arr[i]);
			}
		}
		return differ;
	}

	public void trimToSize() {
		this.capacity = size + 1;
	}

	public void removeRange(int s, int l) {
		int c = l - s;
		for (int i = s; i <= size; i++) {
			arr[i] = arr[l++];
		}
		size = size - c;
	}

	public void increaseCapacity() {
		if (size == capacity - 1) {

			capacity += 5;
			Object value[] = new Object[capacity];
			for (int i = 0; i <= size; i++) {
				value[i] = arr[i];
			}
			arr = value;
		}
	}
}