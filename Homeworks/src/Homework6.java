import pts.MyArray;

public class Homework6 {
    public static void main(String[] args) {
        MyArray array = new MyArray();

        //кладем 5 эелементов
        array.put("1st");
        array.put("2nd");
        array.put("3rd");
        array.put("4rd");
        array.put("5rd");

        System.out.println("Длина: " + array.length());
        System.out.println(array.get()); //выводим 1-ый эелемент
        System.out.println(array.get()); //выводим 2-ой эелемент
        System.out.println(array.get()); //выводим 3-ий эелемент
        System.out.println(array.get()); //выводим 4-ый эелемент
        System.out.println(array.get()); //выводим 5-ый эелемент
        System.out.println("Длина: " + array.length());

        //два раза проверим что нет элементов
        System.out.println(array.get());
        System.out.println(array.get());

        System.out.println("Длина перед тем как положить элемент: " + array.length());
        array.put("new Elem");
        System.out.println("Длина после того как положили: " + array.length());
        System.out.println(array.get()); //выводим 1-ый эелемент

    }

}
