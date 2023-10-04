package md.tekwill.exceptionsservicetask;

public class ArithmeticOperationService {

    public static double divideWithoutErrorExceptionHandling(double a, double b){
        return a/b;
    }

    public static double divideWithErrorExceptionHandling(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException capturedException) {
            //System.out.println(capturedException.getMessage());
            System.out.println("opss! error message: " + capturedException.getMessage()+ " This code is executed only if there is an exception caught");
            return 0.0;
        } finally {
            System.out.println("This block is executed all the times");
        }
    }
}
