package md.tekwill.bookcollectiontask;

public class IntNumberArrayService {

    public static int findMin(int[] arrayTable){
        int min = arrayTable[0];
        for (int i = 1; i < arrayTable.length; i++){
            if (min > arrayTable[i]){
                min = arrayTable[i];
            }
        }
        return min;
    }

    public static double findMed(int[] arrayTable){
        int sum = 0;
        for (int i = 0; i < arrayTable.length; i++){
            sum += arrayTable[i];
        }
        return sum/(arrayTable.length);
    }

    public static void printAllValues(int[] arrayTable){
        System.out.print("Sirul propus este: ");
        for (int i = 0; i < arrayTable.length-1; i++){
            System.out.print(arrayTable[i] + ", ");
        }
        System.out.println(arrayTable[arrayTable.length-1] + ".");
    }
}
