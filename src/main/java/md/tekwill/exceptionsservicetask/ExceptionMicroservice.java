package md.tekwill.exceptionsservicetask;

public class ExceptionMicroservice {

    public static void main(String[] args) {
        String controlVariable = null;

        //System.out.println("The String Length is " + TextManager.getTheLength(controlVariable));
        System.out.println("The String Length is " + TextManager.getTheLengthWithTryAndCatch(controlVariable));
        System.out.println("The length is (with if control) " +TextManager.getTheTextLengthWithIf("mama"));

        System.out.println("Division without error exception handling " + ArithmeticOperationService.divideWithoutErrorExceptionHandling(4.0,0.0));
        System.out.println("Division with error exception handling " + ArithmeticOperationService.divideWithErrorExceptionHandling(4.0,0.0));
    }
}
