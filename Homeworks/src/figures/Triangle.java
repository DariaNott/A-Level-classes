package figures;

public class Triangle extends Figure implements Productable, Summable {
    private double a;
    private double b;
    private double c;

    public Triangle (int a, int b, int c) {
        super("Triangle");
        parameterCheck(a);
        this.a=a;
        parameterCheck(b);
        this.b=b;
        parameterCheck(c);
        this.c=c;
    }

    @Override
    public double getPerimeter() {
        double per = a + b + c;
        return per;
    }

    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        double h = (2*Math.sqrt(p*(p-a)*(p-b)*(p-c)))/a;
        double ar = (a*h)/2;
        return ar;
    }
}