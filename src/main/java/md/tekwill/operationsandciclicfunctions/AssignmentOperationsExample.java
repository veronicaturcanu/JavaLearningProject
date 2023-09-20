package md.tekwill.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a = a + 1;
        System.out.println(a);

        b = b % a;
        System.out.println(b);

        a%=b;
        System.out.println(a);

        int x = 5;
        int sum = 0;
        for (int i = 0; i <= x; i++){
            sum += x;
        }
        System.out.println("Suma in urma iteratiilor = " + sum);
    }
}
