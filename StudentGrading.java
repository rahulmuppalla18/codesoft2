 import java.util.Scanner;

public class StudentGrading {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter Math score: ");
        int mathScore = input.nextInt();

        System.out.print("Enter English score: ");
        int englishScore = input.nextInt();

        System.out.print("Enter Science score: ");
        int scienceScore = input.nextInt();

        System.out.print("Enter Social score: ");
        int socialScore = input.nextInt();

        System.out.print("Enter Computer score: ");
        int computerScore = input.nextInt();
        

        double averageScore = (mathScore + englishScore + scienceScore) / 3.0;

        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Math Score: " + mathScore);
        System.out.println("English Score: " + englishScore);
        System.out.println("Science Score: " + scienceScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
    }
}
