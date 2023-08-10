public class DeleteArray {
    public static void show(int a[]) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static int[] copy(int a[], int length) {
        int c[] = new int[length];
        for (int i = 0; i < length; i++) {
            c[i] = a[i];
        }
        return c;
    }

    public static int[] del(int a[], int val) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (a[i] == val) {
                for (int j = i; j < length - 1; j++) {
                    a[j] = a[j + 1];
                }
                length--;
                i--;
            }
        }
        a = copy(a, length);
        return a;
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 4, 2, 1 }, { 2, 1, 8, 2 }, { 11, 12, 1, 2 }, { 2, 2, 8, 10 } };
        for (int i = 0; i < a.length; i++) {
            a[i] = del(a[i], 2);
            show(a[i]);
        }
    }
}