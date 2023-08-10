
public class Findchar {

    public static void main(String[] args) {
        String s = "sohaib";
        char f = 'a';
        int c = 0;
        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (f == ch[i]) {
                c++;
                System.out.println("character " + f + " found at " + c + " index");
                break;
            } else {
                c++;
            }
        }
    }
}