package md.tekwill.exceptionsservicetask;

public class TextManager {

    public static int getTheLength(String inputString) {
        return inputString.length();
    }

    public static int getTheLengthWithTryAndCatch(String inputString){
        try {
            return inputString.length();
        } catch (NullPointerException exceptionFromTheTryBlock){
            System.out.println(exceptionFromTheTryBlock.getMessage());
            return 0;
        }
    }

    public static int getTheTextLengthWithIf(String inputText){
        if (inputText.length() == 0) {
            System.out.println("Null text");
            return 0;
        } else {
            System.out.println("Not null text");
            return inputText.length();
        }
    }
}
