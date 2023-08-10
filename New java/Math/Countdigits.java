public class Countdigits {

    public int countdigits(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n = n / 10;
        }
        return c;

    }

    public static void main(String[] args) {
        Countdigits obj = new Countdigits();
        System.out.println(obj.countdigits(100));
    }
}