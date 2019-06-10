import figures.*;

public class Homework8 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(3, 4);
        Square s1 = new Square(4);
        Triangle t1 = new Triangle(4, 7, 8);

        Figure[] fig = new Figure[]{c1, r1, s1, t1};
        for (Figure f : fig) {
            System.out.println("This is " + f.getFiguresName());
            System.out.println("Its perimeter is " + f.getPerimeter());
            System.out.println("Its area is " + f.getArea());
        }

    }
}
