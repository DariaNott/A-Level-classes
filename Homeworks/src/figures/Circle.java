package figures;

public class Circle extends Figure implements Productable, Summable {
    private int a;
    final double P = 3.14;

    public Circle (int a) {
        super("Circle");
        parameterCheck(a);
        this.a=a;
    }

    @Override
    public double getPerimeter() {
        double per = 2 * P * a;
        return per;
    }

    @Override
    public double getArea(){
        double ar = Math.pow(a, 2)*P;
        return ar;
    }

}
