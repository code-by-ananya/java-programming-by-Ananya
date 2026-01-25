import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = input.nextInt();
        System.out.print("enter second number: ");
        int num2 = input.nextInt();

        int min = num1 > num2 ? num2 : num1;
        System.out.println("The minimum number is: " +min);
    }
}
