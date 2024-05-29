import java.util.Scanner;
public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Student Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of subjects : ");
        int numSub = scanner.nextInt();
        
        System.out.println("");
    
        int totalMarks = 0;

        for (int i = 1; i <= numSub; i++) {
            System.out.print("Enter Marks obtained (out of 100) in each subject " + i + " : ");
            int marks = scanner.nextInt();
    
            totalMarks += marks;    
        }
        
        double averagePercentage = (double) totalMarks / numSub;

        String grade;
        
        if (averagePercentage >= 90) {
            grade = "A";
        } 
        else if (averagePercentage >= 80) {
            grade = "B";
        } 
        else if (averagePercentage >= 70) {
            grade = "C";
        } 
        else if (averagePercentage >= 40) {
            grade = "D";
        } 
        else {
            grade = "Fail";
        }

        System.out.println("\n    *******   Result   ********    ");
        System.out.println("\nStudent Name  : " + name );
        System.out.println("Total Marks Of " + numSub + " Subjects : " + totalMarks);
        System.out.println("Average Percentage : " + averagePercentage + " %");
        System.out.println("Grade Based on Percentage : " + grade);
        System.out.println("");

        scanner.close();
    }
}