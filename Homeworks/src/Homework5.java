import pts.MyInt;
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
    }
}

