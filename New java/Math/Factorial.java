public class Factorial {

    public int factorial(int n) {
        int a = 1;
        for (int i = n; i >= 1; i--) {
            a = i * a;
        }
        return a;

    }

    public static void main(String[] args) {

        Factorial obj = new Factorial();
        System.out.println(obj.factorial(5));
    }
}