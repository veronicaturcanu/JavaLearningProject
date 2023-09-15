package md.tekwill.classesandobjects;

import md.tekwill.classesandobjects.autoservicetask.Car;
import md.tekwill.classesandobjects.autoservicetask.Garage;
import md.tekwill.classesandobjects.autoservicetask.Person;
import md.tekwill.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage autoDocGarage;
        autoDocGarage = new Garage();
        autoDocGarage.address = "Stefan cel Mare 64";
        autoDocGarage.surfaceM2 = 450.0F;

        System.out.println("Obiectul autoDocGarage are urmatoarele proprieteti "+
                autoDocGarage.address + " " + autoDocGarage.surfaceM2 + " " + autoDocGarage.capacity);

        Garage garajIaloveni = new Garage();

        System.out.println("Obiectul autoDocGarage are urmatoarele proprieteti "+
                garajIaloveni.address + " " + garajIaloveni.surfaceM2 + " " + garajIaloveni.capacity);

        Worker vasile = new Worker();

        vasile.name = "Vasile";
        vasile.age = 54;

        System.out.println("Obiectul nostru are numele de " + vasile.name + " virsta " + vasile.age);

        Person client1 = new Person(enteredThe);

        Car porsheNKK132 = new Car(vinCodeInput "", mark);
        Car mercedesBenzTranzit = new Car();

        System.out.println("Masina noastra este " + porsheNKK132.mark + " si proprietarul poate fi apelat la " +
                porsheNKK132.owner.phoneNumber);

    }
}
