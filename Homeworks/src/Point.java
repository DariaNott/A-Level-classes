public class Point {
    int x;
    int y;

    void info() {
        System.out.println("(" + x + "; " + y + ")");
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
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
