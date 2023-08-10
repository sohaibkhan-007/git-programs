public class Isprime {

    public boolean prime(int n) {

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;

        }
        return true;

    }

    public static void main(String[] args) {
        Isprime obj = new Isprime();
        System.out.println(obj.prime(7));

    }
}