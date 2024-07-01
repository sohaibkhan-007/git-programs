public class rectangle {
    private int result;

    public int area(int a, int b) {
        result = a * b;
        return result;
    }

    public int parameter(int a, int b) {
        result = 2 * (a + b);
        return result;
    }

    public static void main(String[] args) {
        rectangle obj = new rectangle();
        System.out.println(obj.area(10, 10));
        System.out.println(obj.parameter(10, 10));
    }
}
