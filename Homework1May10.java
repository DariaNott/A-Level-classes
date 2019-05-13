public class Homework1May10 {
    public static void main(String[] args){
        // Part 1
        System.out.println("Task 1");
        String name="Daria";
        int age=22;
        float weight=68.9f;
        System.out.print(name+", "+age+" years, "+weight+" kg.");
        System.out.println();
        System.out.println();
        // Part 2
        System.out.println("Task 2");
        int a =1;
        int b =2;
        System.out.println("Original values");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int tmp;
        tmp=a;
        a=b;
        b=tmp;
        System.out.println("Exchanged values");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println();
        //Part 3
        System.out.println("Task 3");
        int c =5;
        int d =3;
        System.out.println("Original values");
        System.out.println("a="+c);
        System.out.println("b="+d);
        c=d+c;
        d=c-d;
        c=c-d;
        System.out.println("Exchanged values");
        System.out.println("a="+c);
        System.out.println("b="+d);
    }
}
