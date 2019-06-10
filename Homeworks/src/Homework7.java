import pts.Guard;
import pts.Soldier;
import pts.Cavalryman;
import pts.Huntguard;
import pts.Circle;

public class Homework7 {


    public static void main(String[] args) {
        Guard bodyguard = new Guard("Guard", 60, 70);
        Soldier centralblock = new Soldier("Soldier", 75, 70);
        Cavalryman lastrow = new Cavalryman("Cavalryman", 90, 100);
        Huntguard sidetroops = new Huntguard("Huntguard", 90, 130);

        Guard[] hunt = {bodyguard, centralblock, lastrow, sidetroops};
        for (int i = 0; i < hunt.length; i++) {
            hunt[i].outfit();
            if (hunt[i] instanceof Soldier) {
                Soldier sold = (Soldier) hunt[i];
                sold.movement();
            }
            if (hunt[i] instanceof Cavalryman) {
                ((Cavalryman) hunt[i]).atack();
            }
        }
        sidetroops.collect();

        System.out.println("\n Circle task.");

        Circle r1 = new Circle(10);
        Circle r2 = new Circle(25);
        Circle r3 = new Circle(40);
        Circle r4 = new Circle(55);

        Circle[] circles = new Circle[]{r1, r2, r3, r4};
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i].getPerimeter(circles[i].radius));
        }
    }
}

