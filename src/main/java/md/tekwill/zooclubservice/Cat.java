package md.tekwill.zooclubservice;

public class Cat extends Animal{

   public Cat(String name){
       super(name);
   }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("A cat is eating fish");
    }
}
