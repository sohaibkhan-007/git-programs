public class Perfact {
    public static int a = 0, i;

    public boolean perfact(int n) {
        for (i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                a = a + i;
            }
        }
        if (a == n) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {

        Perfact obj = new Perfact();
        System.out.println(obj.perfact(6));

    }
}