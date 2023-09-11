package variablesandcomments;

public class VariablesAndComments {
    public static void main(String[] args) {
        //Declarare variabile

        boolean isUsed;
        boolean hasBattery;
        boolean isAndroid;
        char condition;
        byte numberOfSimCards;
        short productionYear;
        int numberOfOwners;
        long id;
        float operatingSystemVersion;
        double price;

        // initierea unui telefon Iphone
        isUsed = false;
        hasBattery = true;
        isAndroid = false;
        condition = 'A';
        numberOfSimCards = 2;
        productionYear = 2022;
        numberOfOwners = 1;
        id = 787564565L;
        operatingSystemVersion = 16.16F;
        price = 24500.1234d;

        System.out.println("The phone is used?" + isUsed);
        System.out.println("The phone price=" + price);
    }
}
