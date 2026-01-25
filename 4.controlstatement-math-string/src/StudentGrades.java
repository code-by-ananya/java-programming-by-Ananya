import java.util.Scanner;

public class StudentGrades{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the marks: ");
        int marks = input.nextInt();

        String grades = marks > 80 ? "high" : (marks > 50 ? "moderate" : "low");
        System.out.println("the grades are : " +grades);
    }
}
