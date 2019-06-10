package pts;

public class Soldier extends Guard {
    public Soldier(String type, int armor, int hp) {
        super(type, armor, hp);
    }

    @Override
    public void outfit() {
        System.out.println("Soldirs have guns");
    }

    public void movement() {
        System.out.println("Soldiers march");
    }
}
