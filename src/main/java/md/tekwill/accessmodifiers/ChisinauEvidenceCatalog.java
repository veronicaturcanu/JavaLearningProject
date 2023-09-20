package md.tekwill.accessmodifiers;

import md.tekwill.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    static public void main(String[] args) {

        Person mirceaTurcanu = new Person("Mircea", false, 2016236325565L);

        System.out.println("Persoana " + mirceaTurcanu.name + " a fost creata cu ajutorul " +
                "constructorului din 3 parametri formali, \ndatele disponibile sunt numele si pensionarea: " +
                        mirceaTurcanu.name + " " +mirceaTurcanu.isRetired +
                "\nrestul parametrilor nu sunt accesibili din aceasta clasa.");

        Person veronicaTurcanu = new Person("Veronica", false, 33, "F", 2006206547894L);
        Person galinaTurcanu = new Person("Galina", true, 64, "F", 2006206541111L);

        if (veronicaTurcanu.isRetired){
            System.out.println(veronicaTurcanu.name + " este la pensie.");
        }else {
            System.out.println(veronicaTurcanu.name + " nu este la pensie");
        }

        if (mirceaTurcanu.isRetired){
            System.out.println(mirceaTurcanu.name + " este la pensie.");
        }else {
            System.out.println(mirceaTurcanu.name + " nu este la pensie");
        }

        if (galinaTurcanu.isRetired){
            System.out.println(galinaTurcanu.name + " este la pensie.");
        }else {
            System.out.println(galinaTurcanu.name + " nu este la pensie");
        }

        Person.retirementAgeWomen=63;
        System.out.println("în Moldova, vârsta majoratului este: " + Person.legalAge +
                "\niar vârsta pensionării pentru femei este " + Person.retirementAgeWomen);

    }
}
