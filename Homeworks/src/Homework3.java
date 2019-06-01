import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner root = new Scanner(System.in);
        System.out.println("Введите степень корня: ");
        int n = root.nextInt();
        System.out.println("Введите подкоренное число: ");
        int a = root.nextInt();
        double nthRoot = Math.pow(a, 1.0 / n);
        System.out.println("Ответ: " + nthRoot);
        System.out.println();

        Scanner nums = new Scanner(System.in);
        System.out.println("Введите числа через пробел: ");
        String line = nums.nextLine();
        String[] array = (line.split(" "));
        int[] intArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArr[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(intArr);
        System.out.println("Минимальное число: " + intArr[0]);
        System.out.println("Максимальное число: " + intArr[intArr.length - 1]);
        System.out.println();

        String verse = "Роняет лес багряный свой убор,\nСребрит мороз увянувшее поле,\nПроглянет день как будто поневоле\nИ скроется за край окружных гор.";
        System.out.println(verse);
        int max = verse.length();
        char symb = 'о';
        int count = 0;
        for (int h = 0; h < max; h++) {
            if (verse.charAt(h) == symb) {
                count++;
            }
        }
        System.out.println("\nВ тексте " + count + " символов 'о'");
        System.out.println();

    }
}
