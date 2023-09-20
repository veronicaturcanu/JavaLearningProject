package md.tekwill.operationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {

        int a = 89;
        int b = 34;

        System.out.println("Valoare a++ este: " + a++);
        System.out.println("Valoare ++a dupa a++ este: " + ++a);

        a = a + 1;
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);

        System.out.println("Valoare ++b este: " + ++b);
        System.out.println("Valoare --b dupa ++b este: " + --b);
    }
}
