package md.tekwill.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int min = 1;
        int max = 20;

        for (int i = min; i <= max; i++){
            System.out.print(i + ", ");
        }

        System.out.println("\nNumerele pare din sirul dat sunt: ");
        for (int i = min; i <= max; i++){
            if (i%2 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nNumerele impare din sirul dat sunt: ");
        int i = min;
        while (i<=max){
            if (i%2 != 0) {
                System.out.print(i + ", ");
            }
            i++;
        }

        System.out.println("\nDivizori ai lui 5 din sirul dat sunt: ");
        int j = max;
        do {
            if (j%5 == 0) {
                System.out.print(j + ", ");
            }
            j--;
        } while (j>=min);
    }
}
