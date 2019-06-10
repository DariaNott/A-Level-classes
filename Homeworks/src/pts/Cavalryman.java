package pts;

public class Cavalryman extends Soldier {
    public Cavalryman(String type, int armor, int hp) {
        super(type, armor, hp);
    }

    @Override
    public void outfit() {
        System.out.println("Cavalry soldirs have rifles");
    }

        @Override
        public void movement() {
            System.out.println("Cavalry soldiers ride horses");
        }

    public void atack() {
        System.out.println("Cavalry soldiers can shoot animals");
    }
}
