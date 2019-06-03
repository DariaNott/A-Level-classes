import pts.MyInt;
import pts.Point;

public class Homework5 {
    public static void main(String[] args) {
        MyInt a1 = new MyInt(3);
        a1.showX();
        MyInt a2 = new MyInt(a1.x);
        a2.showX();
        System.out.println();
        a1.x = 5;
        a1.showX();
        a2.showX();

        Point a = new Point(1, 1);
        Point b = new Point(1, 2);
        Point c = new Point(2, 1);
        Point d = new Point(2, 2);

        Point[] points = new Point[4];
        points[0] = a;
        points[1] = b;
        points[2] = c;
        points[3] = d;

        for (int i = 0; i < points.length; i++) {
            points[i].info();
        }
        System.out.println();
        for (int i = 0; i < points.length; i++) {
            if (points[i].x % 2 == 0 && points[i].y % 2 == 0) {
                points[i].info();
            }
        }
    }
}

