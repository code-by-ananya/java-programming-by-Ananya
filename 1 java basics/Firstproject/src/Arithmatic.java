import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("the summation of two number is: " +(num1 + num2));
        System.out.println("subtraction of two number is: " +(num1 - num2));
        System.out.println("multiplication of two number is : " +(num1 * num2));
        System.out.println("division of two number is: " +(num1 / num2));
        System.out.println("modular division of two number is: " +(num1 % num2));
    }
}
