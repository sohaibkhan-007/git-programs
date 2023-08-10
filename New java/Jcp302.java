class Jcp302 {

    static void m1(int a, double d) {

        System.out.print(" int,double");

    }

    static void m1(long a, long b) {

        System.out.print(" long,long");

    }

    static void m1(Integer a, Integer b) {

        System.out.print(" Integer,Integer");

    }

    public static void main(String[] args) {

        m1(10, 20);

    }

}