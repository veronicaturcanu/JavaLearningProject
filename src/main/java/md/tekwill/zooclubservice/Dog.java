package md.tekwill.zooclubservice;

public class Dog extends Animal{

    private boolean hasAGoodLife;

    public Dog(String nameOfTheDog, boolean hasAGoodLife){
        super(nameOfTheDog);
        this.hasAGoodLife = hasAGoodLife;
    }

    @Override
    public void makeSound() {
        System.out.println("Hrrrr, ham");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats bones");
    }
}
