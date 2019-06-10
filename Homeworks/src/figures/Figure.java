package figures;

public abstract class Figure implements Summable, Productable{
    public String name;

    public Figure () {};

    public Figure(String name){
        this.name = name;
    }

    public String getFiguresName (){
        return name;
    }
}
