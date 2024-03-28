package student.grade.calculator;

import java.util.Map;
import java.util.Scanner;

public class Grade_Calculator {

    Scanner scanner = new Scanner(System.in);

    // Subjects
    int english,  sesotho, history, geo, tourism;

    public static void main(String[] args) {
        int english,  sesotho, history, geo, tourism;
        Grade_Calculator gradeCalculator = new Grade_Calculator();


        // asking for mark for each subject
        english = gradeCalculator.userInput("english");
        sesotho = gradeCalculator.userInput("sesotho");
        history = gradeCalculator.userInput("history");
        geo = gradeCalculator.userInput("geo");
        tourism = gradeCalculator.userInput("tourism");

        // calculating the average
        int studentAverage = getStudentAverage(english, sesotho,history, geo,tourism);

        // giving the grade
        char grade = assignGrade(studentAverage);
        report(english,sesotho,history,geo,tourism,studentAverage,grade);

    }

    public static void report(int english, int sesotho,int history, int geo, int tourism,int average, char grade){
        System.out.println("-------------------");
        System.out.println("Your report card:");
        System.out.println("-------------------");
        System.out.println("english = " + english);
        System.out.println("sesotho = " + sesotho);
        System.out.println("history = " + history);
        System.out.println("geography = "+ geo);
        System.out.println("tourism = " + tourism);
        System.out.println("-------------------");
        System.out.println("Student average: "+ average);
        System.out.println("-------------------");
        System.out.println("Results: " + grade);
    }

    public static int getStudentAverage(int sesotho, int english, int history, int geo, int tourism){
        int average = (sesotho+english+history+geo+tourism)/5;
        return average;
    }

    public static char assignGrade(int averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // ask user for input
    public int userInput(String subject){
        while (true){
            System.out.print("enter results for "+ subject+" : ");
            int results =scanner.nextInt();
            if (results > 100 || results < 0){
                System.out.println("out of 100. Enter valid results");
            }else {
                System.out.println("Done");
                return results;
            }
        }
    }
}
