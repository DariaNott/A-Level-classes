package Homework11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MyMethod myClass = new MyMethod("Hey");

        try {
            Method[] methods = myClass.getClass().getMethods();
            for (Method method : methods) {
                if (method.getAnnotation(Annotation.class) != null) {
                    method.invoke(myClass);
                }
            }
        } catch (InvocationTargetException|IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}