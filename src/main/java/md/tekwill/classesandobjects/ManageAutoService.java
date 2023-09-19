package md.tekwill.classesandobjects;

import md.tekwill.classesandobjects.autoservicetask.*;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage autoDocGarage;
        autoDocGarage = new Garage();
        autoDocGarage.address = "Stefan cel Mare 64";
        autoDocGarage.surfaceM2 = 450.0F;
        autoDocGarage.capacity = 10;
        System.out.println("Obiectul autoDocGarage are urmatoarele proprietati "+
                autoDocGarage.address + ", " + autoDocGarage.surfaceM2 + ", " + autoDocGarage.capacity);

        Garage garajIaloveni = new Garage();
        System.out.println("Obiectul garajIaloveni are urmatoarele proprietati "+
                garajIaloveni.address + ", " + garajIaloveni.surfaceM2 + ", " + garajIaloveni.capacity);

        Worker vasile = new Worker();
        vasile.name = "Vasile";
        vasile.age = 54;
        System.out.println("Obiectul nostru vasile are numele de " + vasile.name + ", virsta " + vasile.age);

        Person client1 = new Person("069123456");

        Car porsheNKK132 = new Car("VIN34656SSSS98988", "Porshe Chayenne",client1);
        Car mercedesBenzTranzit = new Car("VIN123456543RRRR7", "Mercedes Benz Tranzit", new Person("079987456"));

        System.out.println("Masina noastra este " + porsheNKK132.mark + " si proprietarul poate fi apelat la " +
                porsheNKK132.owner.phoneNumber);

        Tool surubelnitaT1 = new Tool("surubelnitaT1");
        surubelnitaT1.weight = 0.50;
        surubelnitaT1.price = 500.5;

        Tool pompaP1 = new Tool();
        pompaP1.name = "pompaP1";
        pompaP1.price = 605.5;
        pompaP1.weight = 20.4;

        System.out.println("Instrumentul " + surubelnitaT1.name + " are urmatorii parametri greutate "
                + surubelnitaT1.weight + " pret " + surubelnitaT1.price);

    }
}
