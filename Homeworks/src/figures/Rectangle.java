package figures;

public class Rectangle extends Figure implements Productable, Summable {
    private int a;
    private int b;

    public Rectangle (int a, int b) {
        super("Rectangle");
        this.a=a;
        this.b=b;
    }

    @Override
    public double getPerimeter() {
        double per = 2 * a * b;
        return per;
    }

    @Override
    public double getArea() {
        double ar = a * b;
        return ar;
    }
}
