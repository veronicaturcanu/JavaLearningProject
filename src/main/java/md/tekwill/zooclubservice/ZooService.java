package md.tekwill.zooclubservice;

public class ZooService {

    public static void main(String[] args) {
        Animal charlyDog = new Dog("Charly", true);
        System.out.println(charlyDog.getName());
        charlyDog.eat();
        charlyDog.makeSound();

        Dog rexDog = new Dog("Rex", false);
        System.out.println(rexDog.getName());
        rexDog.eat();

        Cat bonitaCat = new Cat("Bonita");
        System.out.println(bonitaCat.getName());
        bonitaCat.eat();
        bonitaCat.makeSound();
    }

}
