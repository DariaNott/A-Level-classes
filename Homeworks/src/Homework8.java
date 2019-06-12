import figures.*;

import java.util.Scanner;

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
        System.out.println("\nTask for Homework 9");
        while (true) {
            System.out.println("Please enter radius: ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            Circle circle = null;
            try {
                circle = new Circle(a);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR. Invalid value entered!");
                continue;
            }
            System.out.println("Circle's perimeter is " + circle.getPerimeter());
            System.out.println("Circle's area is " + circle.getArea());
            break;
        }


    }
}
