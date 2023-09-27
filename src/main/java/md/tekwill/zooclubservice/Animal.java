package md.tekwill.zooclubservice;

public abstract class Animal implements AnimalInterface{
    private String name;

    public Animal(String nameValue){
        this.name = nameValue;
    }

    public String getName(){
        return name;
    }

    public abstract void eat();
}
