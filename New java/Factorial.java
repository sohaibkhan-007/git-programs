public class Factorial {
    public static void main(String[] args) {
        int n = 5, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += n * n - 1;
        }
        System.out.println(sum);
    }
}