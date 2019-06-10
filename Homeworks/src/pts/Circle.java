package pts;

public class Circle {
    public int radius;
    final double P = 3.14;

    public Circle (int radius){
        this.radius = radius;
    }
    public double getPerimeter (int radius) {
        return radius * (2*P);
    }





}

/*С
Добавить метод getPerimeter()

В методе вычислить периметр круга и вывести его на экран.*/