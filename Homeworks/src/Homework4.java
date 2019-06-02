public class Homework4 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println("The sum is: " + (x + y));
        System.out.print("Numbers one by one: " + x);
        System.out.print(y);
        System.out.println("\n");

        int[] even = new int[100];
        int a = 1;
        for (int u = 0; u < 100; u++) {
            even[u] = a;
            a++;
        }
        for (int num : even) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println();

        int b = 60;
        System.out.println(b + ". Binary: " + Integer.toBinaryString(b)); //111100
        int c = b >> 2;
        System.out.println("60 >> 2: " + c + ". Binary: " + Integer.toBinaryString(c)); //1111
        int d = b >>> 2;
        System.out.println("60 >>> 2: " + d + ". Binary: " + Integer.toBinaryString(d)); //001111
        System.out.println("Оператор >> сдвигает вправо бинарное число на заданное количесвто ячеек. \n Оператор >>> - выполняет такой же сдвиг, но при этом заполняет нулями сдвинутые значения");
        System.out.println("\n");

        String str = "мне пора ложиться спать";
        String[] str1 = str.split(" ");
        for (int i = str1.length - 1; i > -1; i--) {
            System.out.print(str1[i] + " ");
            System.out.println();
        }
    }
}
