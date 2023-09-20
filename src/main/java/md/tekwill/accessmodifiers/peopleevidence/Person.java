package md.tekwill.accessmodifiers.peopleevidence;

import javax.xml.crypto.Data;

public class Person {

    public String name;
    public boolean isRetired;

    //Proprietatile PROTECTED pot fi folosite în clasele din cadrul pachetului, în care se află clasa și clasele moștenitoare.
    protected int age;

    //Proprietatile cu default acces pot fi folosite în clasele din cadrul pachetului, în care se află clasa
    String sex;

    //Proprietatile PRIVATE pot fi apelate si folosite doar in interiorul clasei,
    //daca vom avea Person ionPerson, atunci ion.Person.iDNP nu va putea fi accesat in alta clasa.
    //O proprietate FINAL reprezinta o constanta, asta inseamna ca ea nu se va schimba in timp,
    //prin urmare trebuie ca fiecare obiect initializat sa aiba un ID, acesta fiind inclus in constructor
    private final long iDNP;

    //Variabila statică-de clasă, descrie proprietățile clasei, dar nu a obiectelor
    public static int legalAge=18;
    public static int retirementAgeWomen;

    public Person(String name, boolean isRetired, int age, String sex, long iDNP){
        this.name = name;
        this.isRetired = isRetired;
        this.age = age;
        this.sex = sex;
        this.iDNP = iDNP;
        System.out.println("Un constructor Person cu toti parametrii a fost creat, numele este " + name);
    }

    public Person(String name, boolean isRetired, long iDNP){
        this.name = name;
        this.isRetired = isRetired;
        this.iDNP = iDNP;
    }
}
