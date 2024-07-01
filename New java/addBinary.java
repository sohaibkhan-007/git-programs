public class addBinary {
    public static void main(String[] args) {

        String a = "11";
        String b = "1";
        int f = Integer.parseInt(a, 2);
        int s = Integer.parseInt(b, 2);
        int sum = f + s;
        String result = Integer.toBinaryString(sum);
        System.out.println(result);

    }
}
