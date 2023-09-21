package md.tekwill.operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a && b;

        System.out.println(c);
        System.out.println(!c);
        System.out.println(a || b);

        boolean d = !((a || b) && (a && b));
        System.out.println(d);
    }
}
