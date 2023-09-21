package md.tekwill.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {

        int score = 71;

        if (score >= 90) {
            System.out.println("The grade is A.");
        } else if ((score >= 80) && (score < 90)) {
            System.out.println("The grade is B.");
        } else if ((score >= 70) && (score < 80)) {
            System.out.println("The grade is C.");
        } else {
            System.out.println("Your score is insufficient.");
        }
    }
}
