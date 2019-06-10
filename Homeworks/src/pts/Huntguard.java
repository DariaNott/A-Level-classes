package pts;

public class Huntguard extends Cavalryman {
    public Huntguard(String type, int armor, int hp) {
        super(type, armor, hp);
    }

    @Override
    public void outfit() {
        System.out.println("Huntguard cavalry soldiers have rifles and dog's leashes");
    }

    @Override
    public void movement() {
        System.out.println("Huntguard cavalry soldiers ride horses and walk dogs");
    }

    @Override
    public void atack() {
        System.out.println("Huntguard cavalry soldiers let hunting dogs follow the prey");
    }

    public void collect (){
        System.out.println("Huntguard cavalry soldiers whistle and dogs come back");
    }
}
