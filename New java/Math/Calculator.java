public class calculator {
    private int result;

    public int add(int a, int b) {
        result = a + b;
        return result;
    }

    public int sub(int a, int b) {
        result = a - b;
        return result;
    }

    public int mul(int a, int b) {
        result = a * b;
        return result;
    }

    public int div(int a, int b) {
        result = a / b;
        return result;
    }

    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.add(5, 5));
        System.out.println(obj.sub(5, 5));
        System.out.println(obj.mul(5, 5));
        System.out.println(obj.div(5, 5));

    }

}

    

    