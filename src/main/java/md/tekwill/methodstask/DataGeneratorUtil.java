package md.tekwill.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static Random objectOfRandomClass = new Random();

    public static int getRandomInt(int min, int max) {
        int delta = max-min;
        if ((delta <= 0)||max<0||min<0){
            System.out.println("Ah, max should be greater then min, and both positive int numbers!");
            return 0;
        }
        int randomIntForThisDelta = objectOfRandomClass.nextInt(delta);
        return randomIntForThisDelta + min;
    }

    public static int getRandomInt(int limit){
        if (limit<0){
            System.out.println("The limit should be a positive int.");
            return 0;
        }
        return objectOfRandomClass.nextInt(limit);
    }

    static String getRandomEmail(String domainName){
        String uniqueUUID = UUID.randomUUID().toString();
        return uniqueUUID + "@" + domainName;
    }

    static String getRandomEmail(int maxLenght, String domainName) {
        String acceptedChars = "QWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<maxLenght; i++) {
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString()+ "@"+domainName;
    }

    public static boolean getRandomBoolean() {
        return objectOfRandomClass.nextBoolean();
    }

    public static double getRandomDouble() {
        return objectOfRandomClass.nextDouble();
    }
}
