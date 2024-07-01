class Sample {

    static void m1(int a, long... l) {

        System.out.print(" int,long...");

    }

    static void m1(int a, Object o) {

        System.out.print(" int,Object");

    }

    static void m1(int... a) {

        System.out.print(" ...");

    }

    static void m1(Object ref) {

        System.out.print(" Object");

    }

    public static void main(String[] args) {

        m1(1, 1L);

        m1(1, null);

        m1(null);

    }

}
