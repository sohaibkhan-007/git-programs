class Circle {
    private double result;

    public double area(int r) {
        result = 3.14 * (r * r);
        return result;
    }

    public double circumfrence(int r) {
        result = 2 * 3.14 * r;
        return result;
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.area(2));
        System.out.println(obj.circumfrence(2));
    }

}
