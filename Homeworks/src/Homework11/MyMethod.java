package Homework11;

public class MyMethod {
    private String someStr;

    MyMethod(String someStr) {
        this.someStr=someStr;
    }

    public void oneMethod (){
        System.out.println("This is one method");
    }

    @Annotation
    public void anotherMethod (){
        System.out.println("This is another method");
    }

    public void oneMoreMethod (){
        System.out.println("This is one more method");
    }
}
