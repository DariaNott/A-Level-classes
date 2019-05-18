import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int[] nums = new int[]{76, 98, 32};
        System.out.println("Элементы массива через точку с запятой:" + nums[0] + "; " + nums[1] + "; " + nums[2] + ".");
        System.out.println();

        String str = "Мама мыла раму";
        String[] words = str.split(" ");
        System.out.println(words[0] + "\n" + words[1] + "\n" + words[2]);
        System.out.println();

        String str2 = "Я хочу переносы строк";
        System.out.println(str2.replace(" ", "\n"));
        System.out.println();

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Оригинальный массив:" + Arrays.toString(arr));
        arr[0] = 11;
        arr[4] = 55;
        arr[7] = 88;
        System.out.println("Измененный массив:" + Arrays.toString(arr));
        System.out.println();

        String[] drob = {"2/5", "1/3", "1/8", "3/9", "6/7"};
        System.out.println("Массив дробных чисел:" + Arrays.toString(drob));
        System.out.println();

        byte a = 126;
        int b = -123456789;
        long c = 1122233345;
        int[] abc = new int [3];
        abc[0] = a;
        abc[1] = b;
        abc[2] = (int) c;
        System.out.println(Arrays.toString(abc));
        System.out.println();

        int[][] duo ={{9, 8, 7},
                {6, 5, 4}};
        System.out.println(duo[0][0] + " " + duo[0][1] + " " + duo[0][2] + "\n" + duo[1][0] + " " + duo[1][1] + " " + duo[1][2]);
        System.out.println();

        String hw = "Hello world!";
        System.out.println(hw.charAt(0));
        System.out.println(hw.charAt(hw.length()-1));

        String w = new String(new char[]{'w', 'o', 'r', 'l', 'd'});
        System.out.println(w);
        System.out.println(w.charAt(w.length()-2));
        System.out.println();

        int x =  2;
        int y = 3;
        System.out.println(x++); //операция выполняется после присвоения, поэтому переменная увеличилась на следующей строке
        System.out.println(x); // значение увеличилось т.к. в предыдущей строке мы использовали инкремент
        System.out.println(++x); //преинкремент имеет высокий приоритет и выполняется даже до операции рисвоения, поэтому значение сразу увеличилось
        System.out.println();
        //принцып декремента и предекремента такой же как и у (пре)инкремента.
        System.out.println(y--);
        System.out.println(y);
        System.out.println(--y);
    }
}
