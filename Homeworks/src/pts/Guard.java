package pts;

public class Guard {
    public String type;
    public int armor;
    public int hp;

    public Guard(String type, int armor, int hp) {
        this.type = type;
        this.armor = armor;
        this.hp = hp;
    }

    public void characteristics() {
        System.out.println("Guard type: " + type + "\nHP: " + hp + " Armor: " + armor);
    }

    public void outfit() {
        System.out.println("Guard soldier should be equipped according to its type");
    }

}
