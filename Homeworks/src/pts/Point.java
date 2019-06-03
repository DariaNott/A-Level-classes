package pts;

public class Point {
    public int x;
    public int y;

    public void info() {
        System.out.println("(" + x + "; " + y + ")");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
