public class RevrseStr {

    public static void main(String[] args) {
        String s = sohaib;
        System.out.println("Reverse of\t" + s[0] + "\t is\t" + reverse(s[0]));
    }

    static String reverse(String str) {
        return (str.length() == 1) ? str : str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}