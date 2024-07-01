public class Circle1 {
    private double result;

    public double area(int r){
        result = 3.14*(r*r);
        return result;
    }

    public static void main(String[] args) {
        Circle1 obj = new Circle1();
        System.out.println(obj.area(2));
    }

    }

    






















