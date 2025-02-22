import java.util.Scanner;

public class GradeCalculator {

    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1;
        
        System.out.print("Enter your score: ");
        
        while (true) {
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score >= 0 && score <= 100) { 
                    break;
                } else {
                    System.out.print("Please enter a score between 0 and 100: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a numeric value for the score: ");
                scanner.next();
            }
        }
        
        return score;
    }

    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        double score = getStudentScore();

        String grade = calculateGrade(score);
        
        System.out.println("Your grade is: " + grade);
    }
}
