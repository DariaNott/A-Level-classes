package figures;

public class Square extends Figure implements Productable, Summable {
    private int a;

    public Square (int a) {
        super("Square");
        this.a=a;
    }

    @Override
    public double getPerimeter() {
        double per = 4 * a;
        return per;
    }

    @Override
    public double getArea(){
        double ar = Math.pow(a, 2);
        return ar;
    }

}